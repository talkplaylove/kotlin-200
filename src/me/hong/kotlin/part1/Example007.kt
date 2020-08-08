package me.hong.kotlin.part1

/**
 * 비트 연산자(Bitwise Operator) and or xor inv shl shr ushr
 */
fun main(args: Array<String>) {
  println(15 and 7)
  println(5 or 2)
  println(15 xor 5)
  println(32767.inv())
  println(1 shl 3)
  println(8 shr 1)
  println(-17 ushr 2)
}