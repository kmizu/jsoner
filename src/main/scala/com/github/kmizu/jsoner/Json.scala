package com.github.kmizu.jsoner

sealed trait JsonValue
case class JsonObject(fields: List[(String, JsonValue)]) extends JsonValue {
  def this() {
    this(Nil)
  }
}
case class JsonArray(items: List[JsonValue]) extends JsonValue {
  def this() {
    this(Nil)
  }
}
case class JsonNumber(value: Double) extends JsonValue
case class JsonString(value: String) extends JsonValue
case class JsonBoolean(value: Boolean) extends JsonValue
case object JsonNull extends JsonValue
