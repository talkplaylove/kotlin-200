package ex.kotlin.part2

/**
 * 멤버 함수(Momber Function)
 */
class Building52 {
  var name = "" // 건물명
  var date = "" // 건축일자
  var area = 0 // 면적(m²)

  fun print() {
    println("이름: " + this.name)
    println("건축일자: " + this.date)
    println("면적: ${this.area} m²")
  }
}

fun main(args: Array<String>) {
  val building = Building52()
  building.name = "A 오피스텔"
  building.date = "2017-12-13"
  building.area = 120 * 8

  building.print()
}