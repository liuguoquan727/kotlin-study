package com.liuguoquan.kotlin.tutorial.abs

/**
 * Descriptions: 继承抽象类、实现接口
 *
 * Created by liuguoquan on 2017/11/3.
 */

class Chinese : AbstractPerson(), IBehavior {

  override fun getType(): String {
    return "中国人"
  }

  override fun doEat() {
    println("吃米饭")
  }

  override fun watch() {
    println("看连续剧")
  }

  override fun play() {
    println("泡妞")
  }
}