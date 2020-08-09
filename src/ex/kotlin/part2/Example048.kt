package ex.kotlin.part2

import ex.kotlin.separation.Product

/**
 * 힙 영역의 존재 이유
 */
fun main(args: Array<String>) {
  val product = createProduct()
  printProductInfo(product)
  processProduct(product)
  printProductInfo(product)
}

fun createProduct(): Product {
  val apple = Product()
  apple.name = "Apple"
  apple.price = 1000
  return apple
}

fun processProduct(product: Product) {
  product.price += 100
}

fun printProductInfo(product: Product) {
  println("이름: ${product.name}")
  println("가격: ${product.price}")
}