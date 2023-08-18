package com.hkaya.collections.map.objectOrientedStudyWithMap

import com.hkaya.collections.set.objectOriantedStudyWithSet.Student

fun main(){

    val s1 = Student(1,"Yeşim","9/A")
    val s2 = Student(2,"Mehmet","10/B")
    val s3 = Student(3,"Ece","11/D")
    //val s4 = Student(4,"Ayşe","12/A")

    val students = HashMap<Int,Student>()

    students.put(s1.studentNo,s1)
    students.put(s2.studentNo,s2)
    students.put(s3.studentNo,s3)

    for((key,value) in students){
        println("*************************")
        println("Student no: $key")
        println("Student name: ${value.studentName}")
        println("Student class: ${value.studentClass}")
    }



}