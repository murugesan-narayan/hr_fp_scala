package com.hr.fp.recursion.easy

object ComputeGcd {

  def gcd(x: Int, y: Int): Int =
    if (x == 0) y else gcd(y % x, x)


  /**This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair:List[Int]) = {
    println(gcd(pair.head,pair.reverse.head))
  }

  def main(args: Array[String]) {
    /** The part relates to the input/output. Do not change or modify it **/
    acceptInputAndComputeGCD(io.StdIn.readLine().trim().split(" ").map(x=>x.toInt).toList)

  }

}
