package com.github.kmizu

import java.io.{File, FileInputStream, StringReader}

import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}


package object jsoner {
  def parserFromString(input: String): JSONParser = {
    val lexer = new JSONLexer(new ANTLRInputStream(new StringReader(input)))
    val stream = new CommonTokenStream(lexer)
    new JSONParser(stream)
  }

  def parserFromFile(file: File): JSONParser = {
    val fis = new FileInputStream(file);
    val lexer = new JSONLexer(new ANTLRInputStream(fis))
    val stream = new CommonTokenStream(lexer)
    new JSONParser(stream)
  }
}
