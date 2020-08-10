package ex.kotlin.part2

/**
 * 생성자(Constructor)와 초기화(Initializer) 블록
 */
class Person54 constructor(name: String, age: Int) {
  val name: String
  val age: Int

  init {
    this.name = name
    this.age = age
  }
}

fun main(args: Array<String>) {
  val person = Person54("홍길동", 46)
  println("이름: ${person.name}")
  println("나이: ${person.age}")
}