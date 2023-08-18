package com.hkaya.a03standardprogramingconstructs

import java.util.Scanner

fun main(){

    var names = Array<String>(5){""}

    val input = Scanner(System.`in`)

    println("Please enter 5 names:")

    for (i in 0..4){
        println("Enter ${i+1}.name: ")
        names[i]=input.nextLine()
    }

for((indeks,name) in names.withIndex()){
    println("${indeks+1}.name : $name")
}

}