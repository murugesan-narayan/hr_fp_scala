package com.hr.fp.recursion.easy

object PrefixCompression {

  def main(args: Array[String]) {
    val x = io.StdIn.readLine
    val y = io.StdIn.readLine
    val common = (x zip y).takeWhile(c => c._1 == c._2).unzip._1.mkString("")
    val x1 = x.toSeq.diff(common); val y1 = y.toSeq.diff(common)
    println(s"${common.size} $common\n${x1.size} $x1\n${y1.size} $y1")
  }
}
