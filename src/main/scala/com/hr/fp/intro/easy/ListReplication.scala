package com.hr.fp.intro.easy

object ListReplication extends App {
  def f(num:Int,arr:List[Int]):List[Int] = arr.flatMap(List.fill(num)(_))
  /*arr.flatMap { x =>
    List.fill(num)(x)
  }*/
  println(f(3, List(1,2,3,4)))
}
