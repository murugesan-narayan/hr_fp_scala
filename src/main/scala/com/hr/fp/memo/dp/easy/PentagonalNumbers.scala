package com.hr.fp.memo.dp.easy

object PentagonalNumbers {
  def main(args: Array[String]): Unit = {
    io.Source.stdin.getLines().drop(1).map(_.toLong).foreach{case n => println(((3*n*n - n)/2))}
  }
}
