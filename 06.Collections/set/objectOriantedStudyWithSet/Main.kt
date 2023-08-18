package com.hkaya.collections.set.objectOriantedStudyWithSet

fun main(){

    val s1 = Student(1,"Ahmet","9/A")
    val s2 = Student(2,"Mehmet","10/B")
    val s3 = Student(3,"Ece","12/D")
    val s4 = Student(1,"Ayşe","12/A")

    val students = HashSet<Student>()

    students.add(s1)
    students.add(s2)
    students.add(s3)
    students.add(s4)

    for( s in students){
        println("**************************")
        println("Student no: ${s.studentNo}")
        println("Student name: ${s.studentName}")
        println("Student class: ${s.studentClass}")
    }


}