package com.liuguoquan.kotlin.tutorial.`class`

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2017/10/18.
 */

fun main(args: Array<String>) {
  var stu = Student("liuguoquan", "male")
  println(stu.name)
  println(stu.age)
  println(stu.sex)
  println(stu.serverName())
  println(stu.toString())
  println(Student.doThing())
}