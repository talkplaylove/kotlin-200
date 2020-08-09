package ex.kotlin.part1

/**
 * 논리 연산자(Logical Operator) && || !
 */
fun main(args: Array<String>) {
  val a = 15
  val b = 17

  var bool: Boolean = (a - b < a + b && (a == 15))
  println(bool)

  bool = !((a + b) > (a * 3) || (b - a) > 0)
  println(bool)
}