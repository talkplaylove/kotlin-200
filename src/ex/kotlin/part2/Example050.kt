package ex.kotlin.part2

/**
 * 가비지 컬렉션(Garbage Collection)
 */
fun main(args: Array<String>) {
  var result = ""
  var i = 1

  while (i <= 100) {
    result += "$i"
    i += 1
  }

  println(result)
}