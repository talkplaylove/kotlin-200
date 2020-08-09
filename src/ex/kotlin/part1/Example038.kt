package ex.kotlin.part1

/**
 * 지역 변수와 다른 함수의 지역 변수가 중복될 때
 */
fun main(args: Array<String>) {
  val a = 52
  println(a)

  printA()
  printA2()
}

fun printA() {
  val a = 17
  println(a)
}

fun printA2() {
  val a = 120
  println(a)
}