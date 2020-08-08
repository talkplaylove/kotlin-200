package me.hong.kotlin.part1

/**
 * 정수 타입과 실수 타입
 */
fun main(args: Array<String>) {
  val a: Byte = 125
  val b: Short = (100 + 200) + 100
  var c: Int = 12_4354_6538
  println(c)

  c = 0xFF_88_88
  println(c)

  c = 0b01010010_01100011_01110101_01000101
  println(c)

  var d: Long = -543_7847_3984_7238_4723
  println(d)

  c = a + b
  d = c + 10L
  println(d)

  var e: Float = 67.6f
  val f: Double = 658.456
  e = (e + f).toFloat()
  println(e)
}