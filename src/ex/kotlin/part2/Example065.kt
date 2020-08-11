package ex.kotlin.part2

/**
 * 업캐스팅(Upcasting)
 */
open class Person65(val name: String, val age: Int)

class Student65(name: String, age: Int, val id: Int) : Person65(name, age)

fun main(args: Array<String>) {
  val person: Person65 = Student65("John", 32, 20171218)
}