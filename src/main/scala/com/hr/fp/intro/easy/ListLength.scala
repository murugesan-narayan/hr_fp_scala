package com.hr.fp.intro.easy

object ListLength extends App {
  def f(arr:List[Int]): Int = {
    arr.length
  }

  println(f(List(3,2,4,6,5,7,8,0,1)))
}
