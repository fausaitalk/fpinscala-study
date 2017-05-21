package com.mzy.gavin.chapter2

/**
  * Created by gavin on 2017/5/21.
  * 第一个高阶函数
  */
object P17 {
  //改方法求绝对值
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  //该方法求阶乘
  def factorial(n: Int): Int = {
    //@annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }
  //该方法功能是对Abs方法结果进行格式化输出
  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }
  // 该方法功能是对factorial方法结果进行格式化输出
  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d."
    msg.format(n, factorial(n))
  }

  // We can generalize `formatAbs` and `formatFactorial` to
  // accept a _function_ as a parameter
  //由formatAbs和formatFactorial方法进一步重构出高阶函数
  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
  }
  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
    println(formatFactorial(7))
    println(formatResult("absolute value", -42, abs))
    println(formatResult("factorial", 7, factorial))

    println("=========用匿名函数作为参数==========")
    println(formatResult("increment", 7, (x: Int) => x + 1))
    println(formatResult("increment2", 7, (x) => x + 1))
    println(formatResult("increment3", 7, x => x + 1))
    println(formatResult("increment4", 7, _ + 1))
    println(formatResult("increment5", 7, x => { val r = x + 1; r }))
  }
}
