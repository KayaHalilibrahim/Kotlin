package com.hkaya.collections

import java.util.Scanner

fun main(){

    val input = Scanner(System.`in`)

    val names = ArrayList<String>()

    names.add("Ceyda")
    names.add("Mustafa")
    names.add("Deniz")
    names.add("Halil")
    names.add("Ece")
    names.add("Murat")

    print("Enter a name to search: ")
    val name = input.next()

    for(i in names){
        if(i == name){
            println("$i's name is on the list.")
            break
        }
    }
}