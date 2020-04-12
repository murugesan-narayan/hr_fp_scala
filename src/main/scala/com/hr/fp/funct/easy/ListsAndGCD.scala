package com.hr.fp.funct.easy

object ListsAndGCD {
  def main(args: Array[String]): Unit = {
    val k = scala.io.StdIn.readInt
    // combine input data as a list of tuples:(prime,power)
    val x = (1 to k).map{_=>scala.io.StdIn.readLine}
      .toList.flatMap{_.split(" ").map{_.toInt}.grouped(2)
      .map{arr => (arr(0),arr(1))}.toList}
    // the pow of a prime will be
    // either min (prime appears exactly k times)
    // or 0 (otherwise)
    def findPow(l: List[(Int,Int)]): Int = l.length match {
      case `k` => l.map{case(p,n) => n}.min
      case _ => 0
    }
    // groupBy prime
    println(x.groupBy{case(p,n)=>p}.toList
      // for each prime, find power of gcd
      .map{case (p,l)=>(p,findPow(l))}
      // filter those with power=0 and sort by prime
      .filter{_._2!=0}.sortWith{_._1<_._1}
      .map{case (p,n) => p.toString+" "+n.toString}
      .mkString(" "))
  }
}
