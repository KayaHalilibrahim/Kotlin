package com.hkaya.a05oop2.inheritance.example1

fun main(){

    val car = Car("Black","Automatic","Sedan")


    println("Case type: ${car.case_type}")
    println("Case color: ${car.color}")

    println("----------------------")

    val nissan = Nissan("White","Manual","Nissan Qashqai")

    println("Nissan color: ${nissan.color}")
    println("Case color: ${nissan.gear}")
}

/*
- it only applies to the class.
- it is used to product another class from an existing class.
- The super class is defined by the word open.
- ":" is used.
- A subclass is called subclass.
- The parent class can not access the subclass.
 */