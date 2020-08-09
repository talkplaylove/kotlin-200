package ex.kotlin.part1

/**
 * 메모리의 스택(Stack) 영역
 */
fun main(args: Array<String>) {
  val a = -36
  val result = absolute(a)
  println(result)
}

fun absolute(number: Int): Int {
  return if (number >= 0)
    number
  else -number
}