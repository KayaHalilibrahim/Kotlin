package com.hkaya.trycatch.thread



class FirstThread :Thread() {
    override fun run() {
       for(i in 100..199){
           println("First Thread : $i")
           Thread.sleep(100)  // waiting
       }
    }

}