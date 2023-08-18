package com.hkaya.collections.arraylist

fun main(){

    val numbers = ArrayList<Int>()

    numbers.add(20)
    numbers.add(50)
    numbers.add(40)
    numbers.add(90)
    numbers.add(100)

    for((index,number) in numbers.withIndex()){
        numbers[index] = number*2
    }


    for((index,number) in numbers.withIndex()){
        println("index: $index - number: $number")
    }


}