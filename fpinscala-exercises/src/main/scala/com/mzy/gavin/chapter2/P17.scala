package com.mzy.gavin.chapter2

/**
  * Created by gavin on 2017/5/21.
  */
object P17 {
  def main(args: Array[String]) {
    //println(fib(4))
    // test implementation of `fib`
    println("Actual:   %d, %d, %d, %d, %d, %d, %d".format(fib(0), fib(1), fib(2), fib(3), fib(4), fib(5), fib(6)))

  }
  // 0 and 1 are the first two numbers in the sequence, so we start the accumulators with those.
  // At every iteration, we add the two numbers to get the next one.
  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)
    loop(n, 0, 1)
  }
}
