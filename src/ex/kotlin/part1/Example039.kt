package ex.kotlin.part1

/**
 * 지역 함수(Local Function)
 */
fun main(args: Array<String>) {
  fun printFomular(a: Int, b: Int) {
    println(a * b + a - b)
  }

  printFomular(73, 1)
  printFomular(4, 6)
}