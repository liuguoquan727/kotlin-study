package com.liuguoquan.kotlin.tutorial

/**
 * Descriptions: 常见语句
 *
 * Created by liuguoquan on 2017/10/18.
 */

fun main(args: Array<String>) {
  //in语句
  doIn()
  //when语句
  whenStatement(1)
  whenStatement("hello")
  whenStatement(123L)
  whenStatement(2)
  //is语句类似Java中instanceof
  isStatement("Hello")
  isStatement(2)
}

fun doIn() {
  var x = 1
  var y = 5
  //1存在于区间[1,4]中
  if (x in 1 until y - 1) {
    println("OK")
  }

  //不存在于区间[1,4]中
  if (x !in 1 until y - 1) {
    println("Out")
  }

  //打印[1,5]的数
  for (index in 1..5) {
    println(index)
  }

  var students: Array<String> = arrayOf("lee", "zhang", "liu")
  //遍历数组
  for (name in students) {
    println(name)
  }
  //是否在数组中
  if ("lee" in students) {
    println("yes")
  }
}

fun whenStatement(obj: Any) {

  when (obj) {
    1 -> {
      println("第一项")
    }
    "hello" -> {
      println("字符串hello")
    }
    is Long -> {
      println("Long类型的数据")
    }
    !is String -> {
      println("不是一个String类型数据")
    }
    else -> {
      println("类似Java中的default")
    }
  }
}

fun isStatement(obj: Any) {
  if (obj is String) {
    println(obj.length)
  }

  if (obj !is String) {
    println("不是String类型")
  }
}