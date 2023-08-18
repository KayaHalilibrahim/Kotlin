package com.hkaya.a03standardprogramingconstructs

fun main() {

    for (i in 1..6) {
        print("$i ")
        if (i == 3) {
            break
        }
    }
    println("")

    for (a in 10..20 step 2) {
        if (a == 16) {
            continue
        }
        print("$a ")
    }



}


/*
-Break : Finishes the transaction.
-Continue : process passes.
 */
