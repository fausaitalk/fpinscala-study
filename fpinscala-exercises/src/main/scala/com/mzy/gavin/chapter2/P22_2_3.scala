package com.mzy.gavin.chapter2

/**
  * Created by gavin on 2017/5/23.
  */
object P22_2_3 {
  def main(args: Array[String]) {
    //TODO 怎样调用
  }
  def curry[A,B,C](f: (A, B) => C): A => (B => C) ={
    a => b => f(a, b)
  }
}
