package com.hr.fp.intro.easy

object UpdateList extends App {
  def f(arr:List[Int]): List[Int] = {
    arr.map(_.abs)
  }

  println(f(List(-3,2,-14,6,5,7,8,0,1)))
}
