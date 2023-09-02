package com.hkaya.oop

fun main(){

    var str1: String?= null   // can be null.

    str1?.trim()  // does not work and there is no a mistake.

  //  str1!!.trim()   // run it anyway.  --> we get error.

    //trim() -> it allows you to crop it the  way we want.

    if(str1 != null){  // does not work and there is no a mistake.
        str1.trim()
    }

}


/*
 var bus : Bus? = null  =   lateinit var bus:Bus

 - We can not use lateinit in primitive types.
 - We can use in objects.

 lateinit var number:Int  --->wrong!!!

 */