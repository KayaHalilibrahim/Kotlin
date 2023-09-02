package com.hkaya.a05oop2.interface1.example

fun main(){

    val lion = Lion()
    val apple = Apple()
    val amasyaApple:Apple = AmasyaApple()
    val chicken :Eatable = Chicken()

    val objects = arrayOf(lion,amasyaApple,apple,chicken)

    for(obje in objects){
        if (obje is Eatable){
            obje.howToEat()
        }
        if(obje is Squeezable){
            obje.howToSqueeze()
        }
    }

}