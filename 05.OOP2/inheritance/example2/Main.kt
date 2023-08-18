package com.hkaya.a05oop2.inheritance.example2

fun main(){

    val topkapiPalace = Palace(3,40)
    val bogazVilla = Villa(true,10)

    println(topkapiPalace.numberOfWindow)
    println(topkapiPalace.numberOfTower)

    println("**********************")

    println(bogazVilla.numberOfWindow)
    println(bogazVilla.isGarage)

}