package me.hong.kotlin.part1

/**
 * 흐름 제어-조건문 when
 */
fun main(args: Array<String>) {
  val score = 64

  when (score / 10) {
    6 -> println('D')
    7 -> println('C')
    8 -> println('B')
    9, 10 -> println('A')
    else -> println('F')
  }

  println("test")
}