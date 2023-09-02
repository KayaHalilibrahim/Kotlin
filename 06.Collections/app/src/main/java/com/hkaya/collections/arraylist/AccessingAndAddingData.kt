package com.hkaya.collections.arraylist

fun main(){
     val fruits = ArrayList<String>()

    fruits.add("Apple")
    fruits.add("Strawberry")
    fruits.add("Banana")
    fruits.add("Cherry")
    fruits.add("Pear")

    println(fruits.toString())

    println(fruits.get(3))

    println(fruits[3])

    fruits.add("Kiwi")
    println(fruits.toString())

    fruits[3] = "Pineapple"
    println(fruits.toString())

    fruits.add(1,"Orange")
    println(fruits.toString())



}