package com.hr.fp.adhoc.easy

object MissingNumbers extends App {
  val (_, l1, _, l2) = (
    io.StdIn.readInt(),
    io.StdIn.readLine().split(" "),
    io.StdIn.readInt(),
    io.StdIn.readLine().split(" "),
  )

  l2.diff(l1).distinct.sorted.foreach(i => print(s"$i "))
}
