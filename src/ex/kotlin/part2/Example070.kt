package ex.kotlin.part2

/**
 * Any 클래스
 */
class Building70(
  val name: String = "",
  val date: String = "",
  val area: Int = 0
) {
  override fun toString() =
    "이름: ${this.name}\n" + "건축일자: ${this.date}\n" + "면적: ${this.area}\n"
}

fun main(args: Array<String>) {
  val building = Building70("코틀린", area = 100) // compile error in book's code
  printObject70(building)
}

fun printObject70(any: Any) {
  println(any.toString())
}