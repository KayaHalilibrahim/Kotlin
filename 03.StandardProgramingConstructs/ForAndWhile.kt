package com.hkaya.a03standardprogramingconstructs

fun main(){
print("i:")
    for(i in 0..5){
        print("$i ")
    }

    println("\n-----------increasing--------------")

    // Between 10 and 30 : 5+

    var start = 10
    var finish = 30
    var amount= 5
    print("a: ")

    for(a in start..finish step amount ){
        print("$a ")
    }
    println("\n-----------Decreasing--------------")

    var first = 20
    var later = 10
    var decAmount=2
    print("b:")

    for(b in first downTo later step decAmount){
        print("$b ")
    }

    println("\n-----------until--------------")
     print("c:")
    for(c in 1 until 6){  // 1 dahil 6 dahil değil.
        print("$c ")
    }

        println("\n****************************")

    var count = 1

    while(count < 4){
        println("count: $count")
        count+=1 // count = count +1+
    }



}