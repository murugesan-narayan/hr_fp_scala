package com.hr.fp.adhoc.easy

object RotateString {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines().drop(1)
    println(lines.map(
      x => x.scanLeft(x)(
        (t,_)=>t.tail + t.head).drop(1).mkString(" "))
      .mkString("\n"))
  }
}
