package com.hkaya.a03standardprogramingconstructs

import java.util.Scanner

fun main(){

    val input = Scanner(System.`in`)


    println("if you want to exiting the prgram press 1.")

    while(true){
        println("Please enter a number:")
       var number = input.nextInt()

        if(number ==1){
            println("Exiting the program.")
            break
        }
        if(number%2==0){
            println("This number is even.")
        }
        else{
            println("This number is odd.")
        }
    }

}