package com.liuguoquan.kotlin.tutorial


/**
 * Descriptions: 控制流程语句和基本数据类型
 *
 * Created by liuguoquan on 2017/8/22.
 */

fun main(args: Array<String>) {
  doBasic()
  doIf()
  doWhen()
  doFor()
  doWhile()
  doJump()
}

/**
 * 基本数据类型
 */
fun doBasic() {
  var a: Int = 10
  var b: Float = 10.0f
  var c: Double = 20.5
  var d: Long = 100L
  var e: Short = 11
  var f: Byte = 23
  var bin = 0b111011
  var hex = 0xff
  var assert: Boolean = true
  var char: Char = 'c'
  // 数组
  var students: Array<String> = arrayOf("lee", "zhang", "liu")
  var empty = arrayOfNulls<String>(10)
  var intArray = intArrayOf(1, 2, 3)
  //字符串
  var str: String = "122344"
  println("Print $str") //字符串模板
}

fun doIf() {
  var a = 5
  var b = 3
  var result = if (a > b) {
    println("a > b")
    12
  } else {
    println("a < b")
    false
  }
  if (a > b) {
    println("a > b")
  }
  println("result: $result")
}

fun doWhen() {
  var input = 30
  var ret = when (input) {
    1 -> {
      println("input == 1")
    }

    2 -> {
      println("input == 2")
    }

    in 10..20 -> {
      println("in range 10--20")
    }

    else -> {
      println("input = $input")
    }
  }
  println("result = $ret")
}

fun doFor() {
  var students: Array<String> = arrayOf("lee", "zhang", "liu")
  for (stu in students) {
    println(stu)
  }
  for (index in students.indices) {
    println("index $index name ${students[index]}")
  }
  for ((index, stu) in students.withIndex()) {
    println("index $index name $stu")
  }
}

fun doWhile() {

  var index = 10
  while (index > 0) {
    index--
    println("index: $index")
  }

  do {
    index++
    println("index: $index")
  } while (index < 10)
}

fun doJump() {

  var nums = intArrayOf(1, 2, 3, 4, 5, 6)
  var s = nums.filter { it != 3 }
  println(s)
  lable@ for (num in nums) {
    if (num == 5) {
      continue
      //continue@lable
      //break
      //break@lable
      //return
    }
    println("num = $num")
  }

}