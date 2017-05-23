package com.mzy.gavin.chapter2

/**
  * Created by gavin on 2017/5/22.
  */
object P20 {
  def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean =
      if (n >= as.length - 1) true
      else if (gt(as(n), as(n + 1))) false
      else go(n + 1)

    go(0)
  }

  def gt[A](str: A, ss: A): Boolean = {

    if (str.hashCode() > ss.hashCode()) true
    else false
  }

  def main(args: Array[String]) {

    val as = Array("hadoop","scala", "java", "ke")

    val isSort = isSorted(as, (x:String, y:String) => x.length() < y.length())
    println(isSort)
  }

}
