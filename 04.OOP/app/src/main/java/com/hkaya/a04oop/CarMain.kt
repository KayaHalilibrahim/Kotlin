package com.hkaya.oop

fun main(){

   val bmw = Car("Blue",90,true)

    println("colour: ${bmw.colour}")

    println("--------------------------")
    bmw.getInfo()
    println("--------------------------")

    bmw.colour="black"
    bmw.velocity=150

    bmw.getInfo()
    println("--------------------------")

    bmw.carStop()
    bmw.getInfo()

    println("--------------------------")
    bmw.startCar()
    bmw.speed(200)
    bmw.getInfo()
    println("--------------------------")

    println("******************************")

    val renault = Car("White",70,true)  //second object
}