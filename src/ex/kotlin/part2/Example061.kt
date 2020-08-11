package ex.kotlin.part2

/**
 * 호출 연산자(Invoke Operator) ()
 */
class Product61(val id: Int, val name: String) {
  operator fun invoke(value: Int) {
    println(value)
    println("id: $id\nname: $name")
  }
}

fun main(args: Array<String>) {
  val product = Product61(762443, "코틀린 200제")
  product(108)
}