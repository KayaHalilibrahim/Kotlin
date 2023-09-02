package com.hkaya.collections.map

fun main(){

    val numbers = mapOf(1 to "One", 2 to "two",3 to "tree")

    val cities = HashMap<Int,String>()

    cities.put(63,"Şanlıurfa")
    cities.put(27,"Gaziantep")
    cities.put(1,"Adana")
    cities.put(34,"İstanbul")
    cities.put(10,"Balıkesir")
    cities.put(16,"Bursa")

    println(cities.toString())

    cities.put(16,"Yeni Bursa")

    println(cities.toString())

    println(cities.get(63))

    println(cities.size)   // println(cities.count())

    println(cities.isEmpty())

    println(cities.containsKey(34))
    println(cities.containsValue("İstanbul"))

    for ((key,value) in cities){
      println("$key - $value")
    }

    cities.remove(1)
    println(cities.toString())


}
/*
- Key value
-

 */