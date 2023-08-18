package com.hkaya.trycatch

fun main() {
    val x = 10
    val y = 2
    val array = Array<Int>(2){0}

    try {
        println("result: ${x / y}")
        println("The transaction is complete.")
        array[4] = 8
    } catch (e: java.lang.Exception) {
        println("Number is not divisible by zero.")
    }catch (e:ArrayIndexOutOfBoundsException){
        println("You have exceeded the size of the directory.")
    }





}
