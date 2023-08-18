package com.hkaya.a03standardprogramingconstructs

fun main(){

    val names = arrayOf<String>("Ali", "Ayşe","Mehmet","Ece","Zehra")

    for(name in names){
        println(name)
    }

    for((indeks,name) in names.withIndex()){
        println("$indeks : $name")
    }

}