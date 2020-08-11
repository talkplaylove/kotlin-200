package ex.kotlin.part2

/**
 * 프로퍼티와 멤버 함수의 매개변수 이름이 중복될 때
 */
class AAA {
  var num = 15

  fun memberFunc(num: Int) {
    println(num)
    println(this.num)
  }
}

fun main(args: Array<String>) {
  val a = AAA()
  a.memberFunc(53)
}