package com.hkaya.a05oop2.enumeration

fun main(){

    fun getPaid(size: CannedSize){
        when (size){
            CannedSize.Small -> println(20+30)
            CannedSize.Middle -> println(30+30)
            CannedSize.Big -> println(40+30)
        }
    }

    getPaid(CannedSize.Middle)

}
/*
- Used in parameters.

 */