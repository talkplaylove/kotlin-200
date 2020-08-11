package ex.kotlin.part2

/**
 * 힙 영역의 존재 이유
 */
class Product48 {
  var name = ""
  var price = 0
}

fun main(args: Array<String>) {
  val product = createProduct()
  printProductInfo(product)
  processProduct(product)
  printProductInfo(product)
}

fun createProduct(): Product48 {
  val apple = Product48()
  apple.name = "Apple"
  apple.price = 1000
  return apple
}

fun processProduct(product: Product48) {
  product.price += 100
}

fun printProductInfo(product: Product48) {
  println("이름: ${product.name}")
  println("가격: ${product.price}")
}