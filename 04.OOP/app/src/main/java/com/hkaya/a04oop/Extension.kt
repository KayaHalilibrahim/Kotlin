package com.hkaya.oop

fun main(){

    fun Int.sum(number:Int): Int {

        return this+number
    }



    val result = 5.sum(7)

    println(result)


    infix fun Int.mul(number2 : Int) : Int
    {
        return this*number2
    }

    val result2 = 5 mul 4

    println(result2)


}

/*
- it is used to extend the classes contained in kotlin.
 */