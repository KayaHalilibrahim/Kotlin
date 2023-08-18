package com.hkaya.a03standardprogramingconstructs

import kotlin.math.*
import kotlin.random.Random

fun main(){


    for(i in 1..10){
        val number = Random.nextInt(0,10)   // Generates random  numbers from one to ten.
        println(number)
    }

    println("-----------------")

    val c = ceil(6.4)  // Rounds up.
    println(c)

    println("-----------------")

    val f = floor(6.4) // Round down.
    println(f)

    println("-----------------")

    val s = sqrt(16.0)  // Squre root.
    println(s)

    println("-----------------")

    val a = abs(-20)  // Absolute value..
    println(a)

    println("-----------------")

    val m = max(100,500) // Finds the maximum number between two given numbers.
    println(m)

    println("-----------------")

    val n = min(100,500) // Finds the minimum number between two given numbers.
    println(n)

    println("-----------------")

    val p = 2.0.pow(3.0)   // The power of the given value is taken as the number in the function.
    println(p)

}