package com.hr.fp.recursion.easy


object SequenceColors {
  def sequenceFullColors(balls: String) = {
    def seq(b: List[Char], rd: Int, yb: Int): Boolean = {
      if (b.isEmpty) rd == 0 && yb == 0
      else if (b.head == 'R') rd <= 1 && seq(b.tail, rd + 1, yb)
      else if (b.head == 'G') rd <= 1 && seq(b.tail, rd - 1, yb)
      else if (b.head == 'Y') yb <= 1 && seq(b.tail, rd, yb + 1)
      else if (b.head == 'B') yb <= 1 && seq(b.tail, rd, yb - 1)
      else false
    }

    seq(balls.toList, 0, 0)
  }

  def main(args: Array[String]): Unit = {
    for (_ <- 1 to io.StdIn.readInt())
      println(sequenceFullColors(io.StdIn.readLine()).toString.capitalize)
  }
}
