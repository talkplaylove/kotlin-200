package ex.kotlin.part2

/**
 * 문자열간 + 연산 시 주의점
 */
fun main(args: Array<String>) {
  var first = "Hello"
  var second = "World"
  first += second

  println(first)
}