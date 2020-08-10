package ex.kotlin.part2

/**
 * 프로퍼티와 Getter/Setter
 */
class Person58 {
  var age: Int = 0
    get() {
      return field
    }
    set(value) {
      field = if (value >= 0) value else 0
    }
}

fun main(args: Array<String>) {
  val person = Person58()
  person.age = -30
  println(person.age)
}