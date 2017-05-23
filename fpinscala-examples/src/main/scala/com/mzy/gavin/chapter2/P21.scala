package com.mzy.gavin.chapter2

/**
  * Created by gavin on 2017/5/23.
  */
object P21 {
  def main(args: Array[String]) {
    //TODO 怎样调用partiall???
  }
  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = {
    (b: B) => f(a, b)
  }
}
