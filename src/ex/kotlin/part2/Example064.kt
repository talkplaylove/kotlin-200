package ex.kotlin.part2

/**
 * 상속(Inheritance)
 */
open class Person64(val name: String, val age: Int)

class Student64(name: String, age: Int, val id: Int) : Person64(name, age)

fun main(args: Array<String>) {
  val person = Person64("홍길동", 35)
  val student = Student64("김길동", 23, 20171217)
}