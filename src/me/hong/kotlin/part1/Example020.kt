package me.hong.kotlin.part1

/**
 * 흐름 제어-조건문 if-else
 */
fun main(args: Array<String>) {
  var a = 10
  var b = 5

  if (a < b)
    println("if")
  else
    println("else")

  if (a > b)
    println("a가 크다.")
  else
    println("b는 a 이상이다.")
}