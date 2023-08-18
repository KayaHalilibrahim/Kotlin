package com.hkaya.collections.arraylist

fun main(){

    val numbers = ArrayList<Int>()

    numbers.add(20)
    numbers.add(50)
    numbers.add(40)
    numbers.add(90)
    numbers.add(100)

    var sum = 0

    for(i  in numbers){
        sum+=i
    }

     var average= sum/numbers.size

    println("Average of numbers: ${average}")
}