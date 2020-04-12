package com.hr.fp.recursion.easy

object StringReductions {

  def main(args: Array[String]) {
    val s = io.StdIn.readLine
    println(s.toSeq.distinct.unwrap)
  }
}
