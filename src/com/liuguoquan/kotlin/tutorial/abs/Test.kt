package com.liuguoquan.kotlin.tutorial.abs

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2017/11/3.
 */

fun main(args: Array<String>) {
  var china = Chinese()
  println(china.getType())
  china.doEat()
  china.play()
  china.watch()
  println()
  var american = American()
  println(american.getType())
  american.doEat()
  american.play()
  american.watch()
}