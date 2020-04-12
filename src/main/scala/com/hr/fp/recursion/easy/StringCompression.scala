package com.hr.fp.recursion.easy

object StringCompression {

  def main(args: Array[String]) {
    val s = io.StdIn.readLine
    println ("(\\w)\\1+".r.replaceAllIn (s, m => "$1" + m.toString.length))
  }
}
