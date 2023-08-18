package com.hkaya.collections.arraylist.objectOrientedStudyWithArraylist

fun main(){

    val P1 = Product(1,"Watch",249.99)
    val P2 = Product(2,"TV",4699.99)
    val P3 = Product(3,"Computer",11499.99)

    val products = ArrayList<Product>()

    products.add(P1)
    products.add(P2)
    products.add(P3)

    for(i in products){
        println("---------------------")
        println("${i.productName} : ${i.productPrice}")
    }
    println("---------------------")

}