package com.hkaya.a03standardprogramingconstructs

fun main(){

    val day = 5

    when(day){

        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("There is no such day.")

    }
}