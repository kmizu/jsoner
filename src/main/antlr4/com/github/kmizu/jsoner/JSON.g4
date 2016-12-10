// Derived from http://json.org

grammar JSON;
@header {
  import scala.*;
}

json returns [JsonValue v]
    : o=object {$v = $o.o;}
    | a=array
    ;

object returns [JsonObject o]
    :   '{' p=pairs '}' {$o = new JsonObject($p.v); }
    |   '{' '}' {$o = new JsonObject(); }
    ;

pairs returns [scala.collection.immutable.List<Tuple2<String, JsonValue>> v]
    : h=pair ',' t=pairs {$v = Lists.cons($h.tuple, $t.v);}
    | h=pair {$v = Lists.one($h.tuple);}
    ;

pair returns [Tuple2<String, JsonValue> tuple]
    :  k=STRING ':' v=value {$tuple = new Tuple2<String, JsonValue>($k.getText(), $v.v);}
    ;

array returns [JsonArray a]
    :   '[' vs=values ']' {$a = new JsonArray($vs.vs); }
    |   '[' ']' {$a = new JsonArray(); }
    ;

values returns [scala.collection.immutable.List<JsonValue> vs]
    : h=value ',' hs=values { $vs = Lists.cons($h.v, $hs.vs); }
    | h=value { $vs = Lists.one($h.v); }
    ;

value returns [JsonValue v]
    :   a=STRING {$v = new JsonString($a.getText());}
    |   b=NUMBER {$v = new JsonNumber(java.lang.Double.parseDouble($b.getText()));}
    |   c=object {$v = $c.o;}
    |   d=array  {$v = $d.a;}
    |   'true' {$v = new JsonBoolean(true);}
    |   'false' {$v = new JsonBoolean(false); }
    |   'null' {$v = JsonNull$.MODULE$; }
    ;

STRING :  '"' (ESC | ~["\\])* '"' ;

fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

NUMBER
    :   '-'? INT '.' [0-9]+ EXP? // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP             // 1e10 -3e4
    |   '-'? INT                 // -3, 45
    ;
fragment INT :   '0' | [1-9] [0-9]* ; // no leading zeros
fragment EXP :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]

WS  :   [ \t\n\r]+ -> skip ;
