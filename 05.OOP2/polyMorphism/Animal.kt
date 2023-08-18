package com.hkaya.a05oop2.polyMorphism

open class Animal {

   open  fun sound(){
        println("No sound...")
    }
}

/*
- "open" should be added to the method to be overridden.
- it is the reuse of the superclass's methods by the subclass.
 */