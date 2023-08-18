package com.hkaya.kotlin02variablesanddatatype

/*
local ve global variables.

 */

class TestForVariableScope {

    var a = 10
    var b = 40



    fun sum(){  // result is only valid in this block.
        var result = a+b

        println("Sum of the $a and $b : ${a+b}")
    }
}

