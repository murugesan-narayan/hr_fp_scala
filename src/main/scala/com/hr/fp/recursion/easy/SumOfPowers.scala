package com.hr.fp.recursion.easy

object SumOfPowers {
    def numberOfWays(X:Int,N:Int,cur:Int):Int = {
      // Compute the answer in this function over here
      // It is fine to define new functions as and where required
      var value = X-scala.math.pow(cur,N).toInt
      value match {
        case 0 => return 1
        case j if j<0 => return 0
        case _ => return numberOfWays(value,N,cur+1) + numberOfWays(X,N,cur+1)

      }
    }

    def main(args: Array[String]) {
      println(numberOfWays(io.StdIn.readInt(),io.StdIn.readInt(),1))
    }
}
