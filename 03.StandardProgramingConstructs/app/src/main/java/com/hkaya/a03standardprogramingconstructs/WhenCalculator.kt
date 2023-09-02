package com.hkaya.a03standardprogramingconstructs

import java.util.Scanner

fun main(){

    val scan= Scanner(System.`in`)


    val transactions = "---Transaction---\n" +
            "Sum - 1\n" +
            "Sub - 2\n" +
            "Multiply - 3\n" +
            "Divide - 4\n"

    print(transactions)

    println("Please enter a transactions:")
    var choice = scan.nextInt()

    println("Please enter number1:")
    var number1 = scan.nextInt()

    println("Please enter number2:")
    var number2 = scan.nextInt()

    when(choice) {

        1 -> println("result: ${number1 + number2}")
        2 -> println("result: ${number1 - number2}")
        3 -> println("result: ${number1 * number2}")
        4 ->  try {
            println("result: ${number1 / number2}")
        } catch (e: java.lang.Exception) {
            println("integer is not divided zero.")
        }
        else -> println("There is no such transaction.")


    }








}