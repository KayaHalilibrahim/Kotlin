package com.hkaya.oop

class Car(var colour:String, var velocity:Int, var isWorking:Boolean)  {

    fun getInfo(){
        println("colour : $colour")
        println("velocity: $velocity")
        println("is working: $isWorking")
    }
    fun startCar(){
        isWorking=true
    }
    fun carStop(){
        isWorking=false
        velocity=0
    }

    fun speed(km:Int){
        velocity+=km
    }


}