package me.hong.kotlin.part1

/**
 * 문자열(String)
 */
fun main(args: Array<String>) {
  var ch: Char = 'A'
  println(ch)

  ch = '\uAC00'
  println(ch)

  ch = '한'
  println(ch.toInt())
}