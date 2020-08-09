package ex.kotlin.part2

/**
 * 메모리의 힙(Heap) 영역
 */
fun main(args: Array<String>) {
  // 힙 영역에 객체 생성
  val person = object {
    val name: String = "홍길동"
    val age: Int = 36
  }

  println(person.name)
  println(person.age)
}