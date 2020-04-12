package com.hr.fp.intro.easy

object FilterPositions extends App {
  def f(arr:List[Int]):List[Int] = {
    arr.zipWithIndex.filter(_._2 % 2 == 1).map(_._1)

  }

  println(f(List.range(0,8)))
}
