package com.hkaya.kotlin02variablesanddatatype

import java.util.Scanner

fun main(){

    val input = Scanner(System.`in`)

    print("Please enter your name:")
    val name = input.next()   // input.nextLine()

    println("Your name is $name")


}

// if we leave a space,it will not write the value after the space.