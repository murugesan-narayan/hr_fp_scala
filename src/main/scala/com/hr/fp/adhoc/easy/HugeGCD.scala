package com.hr.fp.adhoc.easy

object HugeGCD extends App {
  def gcd(x: BigInt, y: BigInt): BigInt = {
    if (x == 0) y else gcd(y % x, x)
  }

  def product(nums: String): BigInt = {
    nums.split(" ").map(BigInt(_)).product
  }

  val f = () => io.StdIn.readLine()
  val (_, a, _, b) = (f(), product(f()), f(), product(f()))
  println(gcd(a, b) % 1000000007)
}
