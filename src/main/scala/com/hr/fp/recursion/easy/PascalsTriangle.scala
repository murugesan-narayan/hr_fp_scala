package com.hr.fp.recursion.easy

object PascalsTriangle {

  def main(args: Array[String]) {
    /** This will handle the input and output**/
    val digit = io.StdIn.readInt()
    def factorial(num: Int) = (1 to num).product
    (0 until digit).foreach(n =>{
      (0 to n).foreach(r => {
        print(factorial(n)/(factorial(r) * factorial(n-r)) + " ")
      })
      println()
    } )
  }
}
