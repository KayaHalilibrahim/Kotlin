package com.hkaya.a05oop2.interface1.example

open class Apple :Eatable,Squeezable {

    override fun howToEat() {
        println("Slice and eat.")
    }

    override fun howToSqueeze() {
        println("Juice with blender.")
    }
}