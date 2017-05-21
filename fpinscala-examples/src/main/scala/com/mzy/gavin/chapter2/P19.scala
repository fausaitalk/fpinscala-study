package com.mzy.gavin.chapter2

/**
  * Created by gavin on 2017/5/21.
  * 多态函数
  */
object P19 {
  /**
    * 返回数组中第一个匹配到key的索引
    * @param ss 数组
    * @param key 待查找的key
    * @return 找到返回索引，没找到返回-1
    */
  def findFirst(ss: Array[String], key: String): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n + 1)

    loop(0)
  }

  def main(args: Array[String]) {
    val ss = Array("java","scala","hadoop","spark","gavin")
    val key = "scalas"
    println(findFirst(ss,key))
  }
}
