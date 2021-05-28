package com.peoplecounterapp

import kotlin.math.floor

fun main(){

    val stringList: List<String> = listOf("Nayan","Raebareli","MCA","Married")
    val mixedTypeList: List<Any> = listOf("Nayan",31,"Raebareli","MCA",2014,"Married","Salary",140000.0)

    for (value in mixedTypeList){
        if(value is Int)
            println("Integer: $value")
        else if(value is Double)
            println("Double: $value with floor value ${floor(value)}")
        else if(value is String)
            println("String: $value of length ${value.length}")
        else
            println("Unknown Type")
    }

    //Alternative
    for (value in mixedTypeList){
        when(value){
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with floor value ${floor(value)}")
            is String -> println("String: $value of length ${value.length}")
            else -> println("Unknown Type")
        }
    }

    //SMART CAST
    val obj1: Any="I have a dream"
    if(obj1 !is String)
        println("Not a String")
    else
        //obj1 is automatically cast to string in this scope
        println("found a string of length ${obj1.length}")

    //Explicit(UnSafe) casting using 'as' keyword- can go wrong
    val str1: String=obj1 as String
    println(str1.length)

    val obj2: Any=1338
    //it goes wrong and show error ClassCastException Integer cannot cast to string
   // val str2: String=obj2 as String
 //   println(str2.length)

    //Explicit(Safe) casting using 'as?' keyword
    val obj3: Any=1337
    val str3: String?=obj3 as? String // it works
    println(str3) // print null but not show error


}
