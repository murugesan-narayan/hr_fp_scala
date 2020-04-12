package com.hr.fp.intro.easy

object SolveMeFirst {
  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }
}
