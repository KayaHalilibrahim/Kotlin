package com.hkaya.a05oop2.polyMorphism

class Dog : Mammal() {

    override fun sound() {
        println("Hav Hav")
    }

    fun run(){
        println("The dog running...")
    }

}