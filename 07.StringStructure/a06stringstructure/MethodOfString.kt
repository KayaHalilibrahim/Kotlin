package com.hkaya.a06stringstructure

fun main(){

    val str1= "ibrahim"

    println(str1.subSequence(0,3))  // 0<= ..<3

    val str2 ="Beatiful"

    if(str2.contains("eatifu")){
        println("Contains")
    }
    val str3 = "amaiZing"
    println(str3.toUpperCase())
    println(str3.toLowerCase())

    val str4 = "How are you"

    val array = str4.split(" ")

    for(s in array){
        println(s)
    }


    val str5 = "       Hard   study   succesful"
    println(str5.trim())  // does not take leading and trailing spaces.


}