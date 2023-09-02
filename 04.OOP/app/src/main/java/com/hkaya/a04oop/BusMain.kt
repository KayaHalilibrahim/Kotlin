package com.hkaya.oop

fun main(){
    val astor = Bus(60,"Şanlıurfa","Balıkesir",40)

    println(astor.fromWhere)
    println(astor.passenger)

    astor.toWhere="Ankara"

    println(astor.toWhere)

    println("--------------------")

    astor.info()

    println("--------------------")

    astor.getPassenger(8)

    astor.info()

}