package com.hkaya.oop

class Bus(var capacity:Int,var fromWhere:String,var toWhere:String,var passenger:Int) {

    fun info(){
        println("Capacity: $capacity")
        println("From where: $fromWhere")
        println("To where : $toWhere")
        println("Passeger: $passenger")
    }

    fun getPassenger(newPassenger:Int){
        passenger+=newPassenger
    }

}