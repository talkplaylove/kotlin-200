package ex.kotlin.part1

/**
 * 지역 변수와 전역 변수의 이름이 중복될 때
 */
var a = 5

fun main(args: Array<String>) {
  val a = 30
  println(a)
  func()
}

fun func() {
  println(a)
}