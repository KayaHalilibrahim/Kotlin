package com.hkaya.oop

class ExampleOverloading {

    fun sum(number1:Int,number2:Int){
        println("sum: ${number1+number2}")
    }
    fun sum(number1:Int,number2:Int,number3:Int){
        println("sum: ${number1+number2+number3}")
    }
    fun sum(number1:Double,number2:Double){
        println("sum: ${number1+number2}")
    }
    fun sum(name1:String,name2:String){
        println("sum: ${"$name1 $name2"}")
    }

}


/*
- Reusing the function with the same name. (Reusing = again using)
- Parameters mmust be different.
 */