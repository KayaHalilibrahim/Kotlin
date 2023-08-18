package com.hkaya.a03standardprogramingconstructs

import java.util.Scanner

fun main(){

    val Pİ = Math.PI
    val input = Scanner(System.`in`)

    println("Area of rectangle - 1")
    println("Area of Circle - 2")

    println("Enter a number (1 or 2):")
    val choose = input.nextInt()

    println("Your choice : $choose")

    if(choose == 1){
        println("Please enter short edge of the rectangle:")
        var shortEdge=input.nextInt()
        println("Please enter long edge of the rectangle:")
        var longEdge=input.nextInt()

        var result = shortEdge*longEdge

        println("Area of the rectangle $result")
    }
    else if(choose == 2){
        println("Please enter radius of the circle:")
        var radius=input.nextInt()
        var result = Pİ*radius*radius
        println("Area of the circle $result")

    }


}
