package com.hkaya.a03standardprogramingconstructs

fun main(){

    var s1 = 60
    var s2 = 40
    var s3 = 70
    var s4 = 10

    println(s1 == s2)  // false
    println(s1 != s2)  // true
    println(s4 > s3)  // false
    println(s3 < s2)  // false
    println(s3 >= s2)  // true
    println(s3 <= s2)  // false

    println("\n-------Logical Operator-------")

    println(s1>s2 && s3>=s4)  //true
    println(s1>s2 || s3<=s4)  //true




}