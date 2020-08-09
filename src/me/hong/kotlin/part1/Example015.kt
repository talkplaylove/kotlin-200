package me.hong.kotlin.part1

/**
 * 배정 연산자(Assignment Operator) =
 */
fun main(args: Array<String>) {
  val a: Int
  var b: Int

  a = 10 + 5
  b = 10

  b += a
  println(b)

  b %= 3
  println(b)
}