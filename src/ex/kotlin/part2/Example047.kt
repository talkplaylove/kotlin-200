package ex.kotlin.part2

/**
 * 클래스(Class)
 */
class Person47 {
  var name: String = ""
  var age: Int = 0
}

fun main(args: Array<String>) {
  val person1 = Person47()
  person1.name = "홍길동"
  person1.age = 36

  val person2 = Person47()
  person2.name = "김미영"
  person2.age = 29

  val person3 = Person47()
  person3.name = "John"
  person3.age = 52
}