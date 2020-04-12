package com.hr.fp.intro.easy

object SumOfOddElements extends App {
  def f(arr:List[Int]): Int = {
    arr.filter(_ % 2 != 0).sum
  }

  println(f(List(3,2,4,6,5,7,8,0,1)))
}
