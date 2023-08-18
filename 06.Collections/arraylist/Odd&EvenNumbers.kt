package com.hkaya.collections.arraylist

fun main(){

    val numbers = ArrayList<Int>()
    numbers.add(6)
    numbers.add(74)
    numbers.add(47)
    numbers.add(11)
    numbers.add(99)
    numbers.add(100)
    numbers.add(80)
    numbers.add(63)

    val oddNumbers = ArrayList<Int>()
    val evenNumbers = ArrayList<Int>()

    for (i  in numbers){
        if(i%2==0){
            evenNumbers.add(i)
        }
        else{
            oddNumbers.add(i)
        }

    }

    println("-------Even number----------")

    for(j in evenNumbers){
        print("$j, ")
    }

    println("\n-------Odd numbers----------")

    for(k in oddNumbers){
        print("$k, ")
    }
}