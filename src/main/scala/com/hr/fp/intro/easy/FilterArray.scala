package com.hr.fp.intro.easy

object FilterArray extends App {
  def f(delim:Int,arr:List[Int]):List[Int] = arr.filter(_<delim)

  println(f(3, List(10,9,8,2,7,5,1,3,0)))
}
