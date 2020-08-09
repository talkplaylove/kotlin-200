package ex.kotlin.part1

import ex.kotlin.separation.abs
import ex.kotlin.separation.max

/**
 * 소스 파일 여러 개로 분리하기
 */
fun main(args: Array<String>) {
  val a = 20
  val b = -30

  println(max(a, abs(b)))
}