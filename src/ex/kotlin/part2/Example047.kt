package ex.kotlin.part2

import ex.kotlin.separation.Person

/**
 * 클래스(Class)
 */
fun main(args: Array<String>) {
  val person1 = Person()
  person1.name = "홍길동"
  person1.age = 36

  val person2 = Person()
  person2.name = "김미영"
  person2.age = 29

  val person3 = Person()
  person3.name = "John"
  person3.age = 52
}