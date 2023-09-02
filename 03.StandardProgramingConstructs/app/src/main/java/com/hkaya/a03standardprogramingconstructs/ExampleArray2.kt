package com.hkaya.a03standardprogramingconstructs

import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    var lectures = Array<String>(5){""}
    var points = Array<Int>(5){0}

    for (i in 0..4){
        println("${i+1}.lecture: ")
         lectures[i] = input.nextLine()
        println("${i+1}.point: ")
        points[i]=input.nextInt()
        input.nextLine()
    }

    for (n in 0..4){
        println("${lectures.get(n)}  : ${points.get(n)}")
    }



    var sumPoints = 0

    for(b in 0..4){
        sumPoints += points[b]
    }
    var average = (sumPoints/5).toFloat()

    println("Average: $average")

    if(average>=50){
        println("Succesful.")
    }
    else{
        println("Failing!!")
    }


}