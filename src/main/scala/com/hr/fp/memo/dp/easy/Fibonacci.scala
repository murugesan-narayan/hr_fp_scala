package com.hr.fp.memo.dp.easy

object Fibonacci {
  def main(args: Array[String]): Unit = {
    val mod = math.pow(10, 8).toInt + 7
    def fib(n: Int): Long = {
      def fib_tail(n: Int, a: Long, b: Long): Long = n match {
        case 0 => a
        case _ => fib_tail(n-1, b, (a + b) % mod)
      }
      fib_tail(n, 0, 1)
    }
    for (_ <- 1 to io.StdIn.readInt) println(fib(io.StdIn.readInt))
  }
}
