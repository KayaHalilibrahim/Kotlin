package com.hkaya.collections.arraylist.exampleEnrollmentInSchool

import java.util.Scanner

fun main(){

    val input = Scanner(System.`in`)

    val students = ArrayList<Student>()

    var count = 1

    while (true){

        println("Enter Student name:")
        val name = input.next()


        println("Enter student class:")
        val claass = input.next()

        val newStudent = Student(count,name,claass)
        count +=1

        students.add(newStudent)

        println("Enter (q) to exit,(1) to continue.")
        val choose =input.next()

        if(choose.equals("q")) {
            println("Exited..")
            break
        }
    }

    println("****************************")

    for (i in students){
        println("Student name: ${i.studentName}")
        println("Student no: ${i.studentNo}")
        println("Student class: ${i.studentClass}")
        println("****************************")
    }


}