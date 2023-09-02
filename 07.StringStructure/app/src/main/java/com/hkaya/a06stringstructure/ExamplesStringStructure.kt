package com.hkaya.a06stringstructure

fun main(){

    val str1 ="Hello"
    println(str1)

    var str2 = String()

    str2= "Kotlin"

    println(str2)

    val str3 = """
        How are you?
        Hello
        Nicee
    """.trimIndent()  //it is used to delete spaces.

    println(str3)

    println("------------------------------------")

    val str4 = ""
    val str5 = String()

    if(str4.isEmpty()){
        println("str4 empty")
    }
    else{
        println("atr4 Full")
    }

    if(str5.isEmpty()){
        println("str5 isempty")
    }
    else{
        println("str5 isFull")
    }
    println("------------------------------------")

    val varA=10
    val varB=20

    println("$varA x $varB = ${varA*varB}")

    val str6 = "Hello "
    val str7 = "World"

    println(str6 + str7)

    val str8 = "Hello, I am learning Kotlin!"

    println(str8.length)

    val str9 = "Halil"
    val str10= "halil"

    if(str9 == str10){
        println("$str9 and $str10 are equal.")
    }
    else{
     println("They are not equal")
    }

    val word = "Kaya"
    for(s in word){
        println(s)
    }

}