package com.datatype

fun main(args: Array<String>) {
    var x: Short = 10
    printDataType(x)
}

fun <T> printDataType(x: T) {
    when (x) {
        is Short -> println(x.toString() + "x is Short")
        is Int -> println(x.toString() + "x is Int")
        is Long -> println(x.toString() + "x is Long")
        is Float -> println(x.toString() + "x is Float")
        is Double -> println(x.toString() + "x is Double")
        is Char -> println(x.toString() + "x is Char")
        is String -> println(x.toString() + "x is String")
        is Byte -> println(x.toString() + "x is Byte")
    }
}