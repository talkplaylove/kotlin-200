package ex.kotlin.part2

/**
 * 오버라이딩(Overriding)
 */
open class AAA66 {
  open fun func() = println("AAA")
}

open class BBB66: AAA66() {
  override fun func() {
    super.func()
    println("BBB")
  }
}

fun main(args: Array<String>) {
  AAA66().func()
  BBB66().func()
}