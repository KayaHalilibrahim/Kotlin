package com.hkaya.collections.arraylist

 fun main(){

     val fruits =  ArrayList<String>()

     fruits.add("Apple")
     fruits.add("Strawberry")
     fruits.add("Banana")
     fruits.add("Cherry")
     fruits.add("Pear")

     println(fruits.isEmpty())  //boolean
     println(fruits.count())
     println(fruits.size)
     println(fruits.first())
     println(fruits.last())

     println(fruits.contains("Apple"))  // boolean

     println(fruits.max())  //in alphebetical order.
     println(fruits.min())

     fruits.sort()
     println(fruits.toString())

     fruits.reverse()
     println(fruits.toString())

     fruits.removeAt(3)
     println(fruits.toString())

     fruits.remove("Cherry")
     println(fruits.toString())

     fruits.clear()
     println(fruits.toString())


 }