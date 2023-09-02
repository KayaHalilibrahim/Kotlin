package com.hkaya.collections.arraylist.arraylistSortOperation

fun main(){
    val p1 = Persons(1,"Mustafa")
    val p2 = Persons(2,"Zeynep")
    val p3 = Persons(3,"Kübra")

    val personsArrayList = ArrayList<Persons>()

    personsArrayList.add(p1)
    personsArrayList.add(p2)
    personsArrayList.add(p3)

    println("First")
    for(i in personsArrayList){
        println("${i.PersonNo} - ${i.personName}")
    }

    println("\n---Small to large - numeric---")

    val sortArrayList1 = personsArrayList.sortedWith(compareBy {it.PersonNo}) // 1-2-3
// val sortArrayList1 = personsArrayList.sortedWith(compareByDescending {it.PersonNo})  --> 3-2-1


    for(j in sortArrayList1){
        println("${j.PersonNo} - ${j.personName}")
    }

    println("\n---Small to large - alphabetic---")


    val sortArrayList2 = personsArrayList.sortedWith(compareBy { it.personName })

    for(k in sortArrayList2){
        println("${k.PersonNo} - ${k.personName}")
    }







}