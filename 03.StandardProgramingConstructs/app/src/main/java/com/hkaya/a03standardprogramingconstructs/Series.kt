package com.hkaya.a03standardprogramingconstructs

fun main(){

    val array = Array<Int>(5){0} // [0,0,0,0,0]  her bir değeri 0 olan 5 elemanlı bir dizi.

    val array2 = arrayOf(1,20,60,40)

    val array3 = arrayOf<Int>(50,10,20)

    val array4 = arrayOf<String>("Ece","Mustafa","Enes")

    val array5 = arrayOf(3,8,"Apple",'a')

    val fruits = arrayOf("strawbery","banana","apple","cherry","pear")

    val str1 = fruits[2]
    println(str1)

    val str2= fruits.get(3)

    println(str2)


    println("\n---change value of index 1 ---")

    fruits[2]="red apple"

    println(fruits.contentToString())  // dizinin tüm elemanlarını gösterir.

    println("\n---change value of index 2 ---")


    fruits.set(1,"new banana")  // girilen indexteki değeri girilen değerle değiştirir.

    println(fruits.contentToString())

    println("\n---some features of array---")

    println(fruits.isEmpty()) // Checks whether it is full or empty.
    println(fruits.count())  //it gives the number of elements of the array.

    println(fruits.first()) // it gives the first element of the array.

    println(fruits.last())  // it gives the last element of the array.

    println(fruits.indexOf("cherry"))  // it gives the index of edtered value.

    println(fruits.contains("kiwi"))  // Finds whether the given value is in the array.

    println(fruits.max()) // largest element in the alphabetical order..

    println(fruits.min())   // Smallest element in the alphabetical order.

    fruits.sort()  // in order from smallest to largest.

    println(fruits.contentToString())

    fruits.reverse()  // reverses the array.

    println(fruits.contentToString())



}


/*
- Array are sorted by index number.
- The first index number is zero.

 */