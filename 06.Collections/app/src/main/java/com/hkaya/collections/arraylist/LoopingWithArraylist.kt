package com.hkaya.collections.arraylist

fun main(){

    val fruits =  ArrayList<String>()

    fruits.add("Apple")
    fruits.add("Strawberry")
    fruits.add("Banana")
    fruits.add("Cherry")
    fruits.add("Pear")


    for(fruit in fruits){
        print("$fruit - ")
    }

    println()

    for((index,fruit) in fruits.withIndex()){
        println("Index: $index  -  fruit: $fruit")
    }

}