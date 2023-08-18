package com.hkaya.kotlin02variablesanddatatype

fun main(){

    var studentName:String="Fatma"  //var studentName="Halil İbrahim Kaya" -> same
    var studentAge=20
    var studentHeight=1.79
    var studentFirstLetter='F'

    println("Student name: $studentName")
    println("Student age: $studentAge")
    println("Student height: $studentHeight")
    println("Student first letter: $studentFirstLetter\n")  // \n continues on a subline.

    var a = 10
    var b = 20

    println("Sum of the $a and $b : ${a+b}")

}

/*
- No need to write data types in kotlin..
- in kotlin, semicolons are not added to the end of lines of code.
- var is used to create a variable.
- The created variables should be written one below the other.(var a = 20 ,var b=60 --> wrong).

 */