package com.hkaya.collections.arraylist.arraylistFilteringOperation

fun main(){

    val s1 = Student(10,"Halil","12/A")
    val s2 = Student(20,"Hatice","12/B")
    val s3 = Student(30,"Mehmet","12/A")
    val s4 = Student(40,"Mustafa","12/B")
    val s5 = Student(50,"Yeşim","12/C")


    val studentArrayList = ArrayList<Student>()

    studentArrayList.add(s1)
    studentArrayList.add(s2)
    studentArrayList.add(s3)
    studentArrayList.add(s4)
    studentArrayList.add(s5)

    val filterArrayList1 = studentArrayList.filter { (it.studentName).contains("a") }

    for(i in filterArrayList1){
        println("Student no: ${i.studentNo} - Student name: ${i.studentName} -  Student class: ${i.studentClass}")
    }

    println("*******************************")

    val filterArrayList2 = studentArrayList.filter { (it.studentNo > 10 )}

    for(j in filterArrayList2) {
        println("Student no: ${j.studentNo} - Student name: ${j.studentName} -  Student class: ${j.studentClass}")

    }

    }