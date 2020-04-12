package com.hr.fp.intro.easy

object AreaUnderCurves {
  import scala.io.StdIn.{readLine, readInt}
  def f(coefficients: List[Int], powers: List[Int], x: Double) =
    (coefficients, powers.map(math.pow(x, _))).zipped.map(_ * _).sum

  def area(coefficients: List[Int], powers: List[Int], x: Double) =
    math.pow(f(coefficients, powers, x), 2) * math.Pi

  def summation(func: (List[Int], List[Int], Double) => Double,
                upperLimit: Int, lowerLimit: Int,
                coefficients: List[Int],
                powers: List[Int]) =
    (1 to (upperLimit - lowerLimit) * 1000)
      .view
      .map(_ / 1000.0)
      .map(lowerLimit + _)
      .map(func(coefficients, powers, _))
      .sum / 1000.0


  // The Input-Output functions will be handled by us. You only need to concentrate your effort on the function bodies above.

  def main(args: Array[String]) {
    print(f(List(1, 2, 3, 4, 5), List(6, 7, 8, 9, 10),1))
    print(f(List(1, 2, 3, 4, 5), List(6, 7, 8, 9, 10),4))
  }
}
