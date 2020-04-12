package com.hr.fp.recursion.easy

import scala.collection.mutable.ListBuffer

object StringOPermute {

  def main(args: Array[String]) {
    val num = scala.io.StdIn.readInt()
    val listInput: ListBuffer[String] = ListBuffer()
    for (i <- 1 to num)
      listInput.append(scala.io.StdIn.readLine)
    for (s <- listInput) {
      for (i <- 0 until s.length-1 by 2) {
        print(s.charAt(i+1))
        print(s.charAt(i))
      }
      println()
    }
  }
}
