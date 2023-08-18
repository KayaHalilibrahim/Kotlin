package com.hkaya.oop

fun main(){


    fun greeting(){
        val result ="Hello Mehmet"
        println(result)
    }

    greeting()

    println("------------------------")

    fun greeting1():String{
        val result="Hello Esra"
        return result
    }
     println(greeting1())

    println("------------------------")

    fun greeting3(name:String){
        val result=name
        println(result)
    }
    greeting3("Musa")

    println("------------------------")

    fun greeting4(name:String) :String{
        val result=name
        return result
    }

    println(greeting4("Zeynep"))
}

