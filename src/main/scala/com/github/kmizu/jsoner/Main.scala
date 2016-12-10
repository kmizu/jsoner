package com.github.kmizu.jsoner

import java.io.StringReader

import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}

object Main {
  def main(args: Array[String]): Unit = {
    val parser = parserFromString(
      """
        | {"name":"Kota Mizushima", "age":33}
      """.stripMargin
    )
    println(parser.json().v);
  }
}
