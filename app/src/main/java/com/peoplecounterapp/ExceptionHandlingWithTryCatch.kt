package com.peoplecounterapp

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NumberFormatException

/*
An exception is a runtime problem which occurs in program that leads to program termination
like- running out of memory, array out of bound, condition like divided by zero
To handle this type of problem during program execution the technique of Exception Handling is used
So Exception Handling is a technique which handles the runtime problem and maintains the flow of program execution.

There are 4 keywords used in exception handling these are-
try- the try block is a set of statement which might generate an execution.
It must be followed by either by catch or finally or both.
catch- The catch block is used to catch the exception thrown by try block.
finally- block is always execute whether the exception is handled or not. so it execute the important code statement.
throw- keyword is used to throw an exception explicitly
 */

/*
Unchecked Exception - that is thrown due to mistake in our code
this exception extends RuntimeException class
unchecked exception is checked at runtime.
example- NullPointerException, ArithmeticException, ArrayIndexOutOfBoundException, SecurityException
 */

/*
Checked Exception- is checked at compile time
this exception type extends throwable class
example - IOException
 */
fun getNumber(string: String) {
    try {
        //code that may throw the exception
        val a = Integer.parseInt(string)
        println(a)
        a
    } catch (e: ArithmeticException) {
        //code that handles the exception
        println(0)
        0
    }
}

fun main() {
    //try-catch block
    //without exception handling
    //if getNumber("10.9") then NumberFormatException
    var str = getNumber("10")
    println(str)

    //multiple catch block
    try {
        val a = IntArray(5)
        a[5] = 10 / 0
    } catch (e: ArithmeticException) {
        println("ArithmeticException catch")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("ArrayIndexOutOfBoundsException catch")
    } catch (e: Exception) {
        println("parent exception class")
    }
    println("code after try catch")

    //Nested try catch block
    try {
        //code block
        try {
            //code block
        } catch (e: Exception) {
            //exception
        }
    } catch (e: Exception) {
        //exception
    }

    //finally block
    try {
        val data = 10 / 5
        println(data)
    } catch (e: NullPointerException) {
        println(e)
    } finally {
        println("finally block always execute")
    }
    println("below code")

    //throw keyword
    validate(15)
    println("code after validation check")
}

fun validate(age: Int){
    if(age<18)
    throw ArithmeticException ("Under age")
    else
        println("eligible for drive")
}