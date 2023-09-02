package com.hkaya.a05oop2.composition.example2

fun main(){


    var adress = Adress("Şanlıurfa","Eyyubiyye")
    var person = Persons("Halil",20,adress)

    println(person.name)
    println(person.adress.city)

}