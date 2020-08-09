package ex.kotlin.part1

/**
 * Unit 타입
 */
fun main(args: Array<String>) {
  celsiusToFah(27)
}

fun celsiusToFah(celsius: Int): Unit {
  println(celsius * 1.8 + 32)
}