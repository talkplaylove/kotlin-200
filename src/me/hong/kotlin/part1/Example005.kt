package me.hong.kotlin.part1

/**
 * 산술 연산자(Arithmetic Operator) + - * / %
 */
fun main(args: Array<String>) {
  val num: Int = 15 - 4 + 3
  val num2: Int = 65 % 7
  val num3: Double = 7.5 / 6 + 22.25
  val num4: Double = num / num2 + 0.7

  println(num)
  println(num2)
  println(num3)
  println(num4)
}