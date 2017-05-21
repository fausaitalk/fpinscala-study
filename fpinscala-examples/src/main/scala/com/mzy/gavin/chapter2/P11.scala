package com.mzy.gavin.chapter2

/**
  * Created by gavin on 2017/5/21.
  *
  * P11
  */
object P11 {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def main(args: Array[String]) {
    println(formatAbs(-42))
  }
}
