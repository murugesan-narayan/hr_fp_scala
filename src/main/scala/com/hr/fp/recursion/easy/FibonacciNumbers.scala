package com.hr.fp.recursion.easy

object FibonacciNumbers {

  def fibonacci(x:Int):Int =
    // Fill Up this function body
    // You can add another function as well, if required
    if(x == 1) 0 else if(x==2 || x==3) 1 else fibonacci(x-1)+fibonacci(x-2)

  def main(args: Array[String]) {
    /** This will handle the input and output**/
    println(fibonacci(io.StdIn.readInt()))

  }

}
