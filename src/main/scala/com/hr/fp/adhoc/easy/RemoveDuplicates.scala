package com.hr.fp.adhoc.easy

object RemoveDuplicates {
  def main(args: Array[String]): Unit = {
    println(io.StdIn.readLine.toSeq.distinct)
  }
}
