package com.hkaya.a03standardprogramingconstructs

import java.util.Scanner

fun main(){

    val input = Scanner(System.`in`)

    val transactions = "---Transaction---\n" +
            "Sum - 1\n" +
            "Sub - 2\n" +
            "Multiply - 3\n" +
            "Divide - 4"

    println("Please enter a transactions:")
    var choice = input.nextInt()

    println("Please enter number1:")
    var number1 = input.nextInt()

    println("Please enter number2:")
    var number2 = input.nextInt()

    if(choice==1){
        println("result: ${number1+number2}")
    }
    else if(choice==2){
        println("result: ${number1-number2}")
    }
    else if(choice==3){
        println("result: ${number1*number2}")
    }
    else if(choice==4){
       try {
           println("result: ${number1/number2}")
       } catch (e:java.lang.Exception){
           println("integer is not divided zero.")
       }
    }
    else{
        println("invalid value.")
    }


}