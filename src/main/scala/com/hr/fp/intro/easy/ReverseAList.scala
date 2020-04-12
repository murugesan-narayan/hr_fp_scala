package com.hr.fp.intro.easy

object ReverseAList extends App {
  def f(arr:List[Int]):List[Int] = {
    arr.reverse

  }

  println(f(List.range(0,8)))
}
