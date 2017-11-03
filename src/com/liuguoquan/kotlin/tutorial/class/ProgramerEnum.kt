package com.liuguoquan.kotlin.tutorial.`class`

/**
 * Descriptions: 枚举类
 *
 * Created by liuguoquan on 2017/11/3.
 */

enum class ProgramerEnum(name: String) {
  JAVA("java"), KOTLIN("kotlin"), C("c"), PYTHON("Python"), GO("Go");

  var value: String = name
}