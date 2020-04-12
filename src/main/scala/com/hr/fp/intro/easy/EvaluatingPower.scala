package com.hr.fp.intro.easy

object EvaluatingPower {
  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    for (nItr <- 1 to n) {
      val x = stdin.readLine.trim.toDouble
      var sum = 0.0
      (1 to 10).map(_.toDouble).foldLeft(1.0)((acc, i) => {sum += acc;  (acc * x) / i})
      println(sum)
    }
  }
}
