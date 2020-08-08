package me.hong.kotlin.part1

/**
 * 실수 타입의 함정
 */
fun main(args: Array<String>) {
  println(0.1f + 0.1f + 0.1f)
  println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f)
  println(0.1f * 10)
}