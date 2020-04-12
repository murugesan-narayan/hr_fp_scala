package com.hr.fp.recursion.easy
import io.StdIn.{readInt, readLine}
object FilterElements {
  def main(args: Array[String]) {
    val n = readInt()
    for (i <- 0 until n) {
      val args = readLine().split(" ")
      val arr = readLine().split(" ").map(_.toInt)
      val result = filterElements(args(1).toInt, arr)
      println(if (!result.isEmpty) result.mkString(" ") else -1)
    }
  }

  def filterElements(k: Int, arr: Array[Int]): Array[Int] = {
    val occurrences = arr.groupBy(identity).view.mapValues(_.length)
    arr.distinct.filter(occurrences(_) >= k)
  }
}
