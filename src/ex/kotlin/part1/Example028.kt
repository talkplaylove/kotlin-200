package ex.kotlin.part1

/**
 * 흐름 제어 break
 */
fun main(args: Array<String>) {
  var i = 0
  while (true) {
    i += 1
    if (i >= 5)
      break
    print(i)
  }
}