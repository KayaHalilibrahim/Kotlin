package com.hkaya.a05oop2.composition.example1

fun main(){

    val categories1 = Categories("Drama",2)
    val categories2 = Categories("Drama",1)
    val categories3 = Categories("Science Fiction",3)


    val directors1 = Directors(1,"Nuri Bilge Ceylan")
    val directors2 = Directors(2,"Quetin Tarantino")
    val directors3 = Directors(3,"2013")


    val movies1 = Movies(1,"Django",2013,categories2,directors2)
    val movies2 = Movies(2,"Inception",2006,categories3,directors3)


    println("movies name: ${movies1.movies_name}")
    println("movies year: ${movies1.movies_year}")
    println("movies categori name: ${movies1.categori.categori_name}")
    println("movies director name: ${movies1.directors.director_name}")



}