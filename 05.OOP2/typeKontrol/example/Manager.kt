package com.hkaya.a05oop2.typeKontrol.example

class Manager: Employe() {
    fun hire(personel : Employe){
        personel.wasHired()
    }

    fun promote(personel :Employe){

        if(personel is Teacher){
           personel.increaseSalary()
        }
        if (personel is Worker){
            println("The worker can not be promote..")
        }

    }

}