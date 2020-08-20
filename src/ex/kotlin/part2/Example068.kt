package ex.kotlin.part2

/**
 * 다형성(Polymorphism)의 활용
 */
open class AAA68 {
  open fun hello() = println("AAA 입니다.")
}

open class BBB68 : AAA68() {
  override fun hello() = println("BBB 입니다.")
}

fun main(args: Array<String>) {
  val one = AAA68()
  val two = BBB68()
  val three: AAA68 = two

  one.hello()
  two.hello()
  three.hello()
}