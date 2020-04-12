package com.hr.fp.intro.easy

object ArrayOfNElements extends App {
  def f(n :Int):List[Int] = {
      List.range(0, n)
  }

  println(f(10))
}
