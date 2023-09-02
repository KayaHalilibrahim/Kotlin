package com.hkaya.a03standardprogramingconstructs

fun main(){

    var age = 20
    var name = "Halil"

    println("---1.Example---")

    if(age >= 18){
        println("You are can enter.")
    }
    else{
        println("You can not enter.")
    }


    println("\n---2.Example---")

    if(name =="ibrahim"){
      println("Hello İbrahim")
    }
    else if(name == "Halil"){
        println("Hello Halil")
    }

    else{
        println("Unknown person.")
    }

    println("\n---3.Example---")

    var userName="Emine"
    var pasword=156

    if(userName=="Ali" && pasword==156){  // true and true : true
        println("Welcome")
    }
    else{
        println("İncorrect Entry.")
    }

    println("\n---4.Example---")

    var community = 10

    if(community == 9 || community==10 || community==11 || community==12){
        println("You can open a student community.")
    }

    println("\n---5.Example---")

    var a = 60
    var b = 65

    if(a==b) println("Equal") else println("it is not equal.")

}