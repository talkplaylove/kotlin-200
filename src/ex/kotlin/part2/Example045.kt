package ex.kotlin.part2

/**
 * 객체(Object)
 */
fun main(args: Array<String>) {
  val person = object {
    val name: String = "홍길동"
    val age: Int = 36
  }

  println(person.name)
  println(person.age)
}