package me.hong.kotlin.part1

/**
 * 문자열(String)
 */
fun main(args: Array<String>) {
  var str: String = "Hello"
  println(str)

  str = str + "\nKotlin!"
  println(str)

  println(str[8])

  val num = 10 + 5 + 3
  println(str + num)
}