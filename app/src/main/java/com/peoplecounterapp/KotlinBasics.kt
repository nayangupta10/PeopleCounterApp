package com.peoplecounterapp

fun main(){
    println("Hello World!")

    //val is immutable variable that could be initialized once not be change
    //TODO: Add new functionality
    /*
    This
    is a multiline
    comment
     */
    val myName="Nayan"
    println("Hello $myName")

    //var is mutable variable that could be change at run time
    // here hisName is address and Sumit is value of this that is stored init.
    var hisName="Gaurav"
    hisName="Sumit"
    print("Hi $hisName")

    //Kotlin is a typed language so it know the type of variable
    //type String
    val name="Nayan"
    //type Int
    //It is mandatory to declare a variable otherwise it will error
    val myAge=32

    //Integer Number Type: Byte(8 bit), Short(16 bit),
    // Int(32 bit) and Long(64 bit)
    val myByte: Byte =23
    val myShort: Short=123
    val myInt: Int=1234
    val myLong: Long=234_456_344_345_345

    //Floating Number Type: Float(32 bit) and Double(64 bit)
    /*If you want to create Float type variable
     then it is mandatory to put F
     at the last of number otherwise it will show error and also recognize number as Double
    */
    val myFloat: Float=13.67F
    val myDouble: Double=3.57489570802802
}