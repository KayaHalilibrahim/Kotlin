package com.hkaya.collections.set

fun main(){

    val fruits = setOf("strawberry","banana","apple")  //setOf<String>("strawberry","banana","apple")

    val cities = mutableSetOf("izmir","Bursa","Şanlıurfa","istanbul")

    val numbers = HashSet<Int>()

    numbers.add(7)
    numbers.add(8)
    numbers.add(5)
    numbers.add(40)

    println(numbers.toString())

    numbers.add(40)   // doesn not add.
    println(numbers.toString())

    numbers.add(10)
    println(numbers.toString())

    println(numbers.elementAt(1))

    println(numbers.size)

    println(numbers.count())

    println(numbers.isEmpty())  //boolean

    println(numbers.contains(5))   //boolean

println("------------")

    for(s in cities){
        println(s)
    }

    for((i,s)  in numbers.withIndex()){
        println("$i - $s")
    }

}