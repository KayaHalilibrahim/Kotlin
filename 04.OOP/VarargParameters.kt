package com.hkaya.oop

fun main(){

    fun sum(vararg numbers:Int):Int{ // 5,6,8
        var result = 0

        for(s in numbers){
            result+=s
        }
        return result
    }

    val t = sum(5,6,2,1,8)  //5,6,2,1,8 ..
    println(t)

}

/*
- We can enter as much data as we want.
- Like a array.
 */