package com.hkaya.a05oop2.typeKontrol.example

fun main(){

    val teacher:Employe = Teacher()
    val worker:Employe = Worker()

    val manager = Manager()

   /*
    manager.hire(teacher)
    manager.hire(worker)
    */


    manager.promote(teacher)
    manager.promote(worker)

}