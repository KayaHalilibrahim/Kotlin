package com.hkaya.a06stringstructure

import java.util.Scanner

fun main(){

    val input = Scanner(System.`in`)

    print("Please enter a word:")
    val word =input.next()

    for(s in (word.length-1) downTo 0 ){
        println(word[s])
    }

}