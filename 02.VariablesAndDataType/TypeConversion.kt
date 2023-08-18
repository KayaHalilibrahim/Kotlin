package com.hkaya.kotlin02variablesanddatatype

fun main(){

    var i :Int = 20
    var d:Double=80.12
    var f :Float= 63.63f

    var result1 = d.toInt()
    var result2 = i.toDouble()


    println(result1)
    println(result2)

    // conversion String

    var str1 = i.toString()
    var str2 = d.toString()
    var str3 = f.toString()

    println(str1)
    println(str2)
    println(str3)

    println("*******************Some mistakes*******************")

    println("\n-------------First method-----------------")

    var text ="96t"

    try {
        var x = text.toInt()
        println(x)
    }catch (e:java.lang.Exception){
        println("There is a mistake.")
    }

    println("\n-------------Second method-----------------")


    var text2 = "100f"

    var y = text2.toIntOrNull()   // toDoubleOrNull

    if(y != null){
        println(y)
    }
    else{
        println("there is a mistake in the conversion!!!")
    }

    println("\n--------------Third method----------------")

    var text3 ="80q"

    var n = text3.toIntOrNull()

    n?.let {                 // İf there is no error in the code, the block works,
        println(" n : $n")        //if there is an error, it does not give an error and the block does not work.
    }


}


/*
- toInt()
- toFloat()
- toString()
 */