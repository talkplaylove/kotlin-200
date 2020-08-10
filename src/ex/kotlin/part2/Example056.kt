package ex.kotlin.part2

/**
 * 생성자와 프로퍼티 한번에 쓰기
 */
class Car(val name: String, val speed: Int = 0)

fun main(args: Array<String>) {
  val car = Car("My Car")
  println(car.name)
  println(car.speed)
}