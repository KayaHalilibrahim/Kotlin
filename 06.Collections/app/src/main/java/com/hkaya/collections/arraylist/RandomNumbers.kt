package com.hkaya.collections

import kotlin.random.Random

fun main(){

    val numbers =ArrayList<Int>()

    for(i in  1..100){
       val randomNumber = Random.nextInt(0,101)
        numbers.add(randomNumber)
    }

    numbers.sort()

    for(j in numbers){
        print("$j, ")
    }

}