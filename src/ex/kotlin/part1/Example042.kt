package ex.kotlin.part1

import ex.kotlin.separation.abs
import ex.kotlin.separation.max

/**
 * 패키지 (41~42)
 */
fun main(args: Array<String>) {
  val a = 20
  val b = -30

  println(max(a, abs(b)))
}