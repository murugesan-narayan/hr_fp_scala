package com.hr.fp.recursion.easy

object StringMingling {

  def main(args: Array[String]) {
    val a = io.StdIn.readLine()
    val b = io.StdIn.readLine()
    for (i <-0 to a.length-1) {
      print(a.charAt(i))
      print(b.charAt(i))
    }
  }
}
