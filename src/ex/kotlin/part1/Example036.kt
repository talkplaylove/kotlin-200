package ex.kotlin.part1

/**
 * 지역 변수(Local Variable)와 전역 변수(Global Variable)
 */
var count = 0

fun main(args: Array<String>) {
  val a = 15
  println(a)

  count += 1
  printCount()
  print(count)
}

fun printCount() {
  println(count)
  count += 1
}