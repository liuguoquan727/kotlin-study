package com.liuguoquan.kotlin.tutorial.`class`

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2017/10/18.
 */

class Student {
  var name: String = "zhang" //var 可变变量
    get() = field.toUpperCase()

  val age: String = "22"  //val 不可变变量
  var sex: String = "female"

  constructor(name: String, sex: String) {
    this.name = name
    this.sex = sex
  }

  fun serverName(): String {
    return "lll"
  }

  override fun toString(): String {
    return "Student(name='$name', age='$age', sex='$sex')"
  }

  /**
   * 相当于静态方法
   */
  companion object {
    public fun doThing(): String {
      println("do things")
      return "OK"
    }
  }

}