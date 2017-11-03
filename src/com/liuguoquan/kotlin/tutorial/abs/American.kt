package com.liuguoquan.kotlin.tutorial.abs

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2017/11/3.
 */

class American : AbstractPerson(), IBehavior {

  override fun getType(): String {
    return "美国人"
  }

  override fun doEat() {
    println("吃西餐")
  }

  override fun watch() {
    println("看美剧")
  }

  override fun play() {
    println("打篮球")
  }
}