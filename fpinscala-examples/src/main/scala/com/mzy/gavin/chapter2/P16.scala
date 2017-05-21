package com.mzy.gavin.chapter2

/**
  * Created by gavin on 2017/5/21.
  */
object P16 {
  def factorial(n: Int): Int = {
    //@annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)

    go(n, 1)
  }
  // Another implementation of `factorial`, this time with a `while` loop
  def factorial2(n: Int): Int = {
    var acc = 1
    var i = n
    while (i > 0) { acc *= i; i -= 1 }
    acc
  }
  def main(args: Array[String]) {
    println(factorial(3))
    println(factorial2(3))
  }
}
