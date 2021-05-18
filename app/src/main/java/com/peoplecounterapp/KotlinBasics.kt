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
    /*If we change the value of val variable
    the it will be compile-time-error.
    Our IDE tell us that we can't overwrite 'val'
    myName="Neha"
     */
    println("Hello $myName")

    //var is mutable variable that could be change at run time
    // here hisName is address and Sumit is value of this that is stored init.
    var hisName="Gaurav"
    //The value Sumit will be change at run-time
    hisName="Sumit"
    //String Concatenation
    println("Hi"+hisName)
    //This is same as String Concatenation
    //String Interpolation
    println("Hi $hisName")

    //Kotlin is a typed language so it know the type of variable
    //type String
    val name="Nayan"
    //type Int
    //type inference finds out the type from context
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

    //Boolean he type Boolean is used to represent logical values
    //It have two type values true or false

    /*there is no need to assign Boolean, String, Double, Int
    and Float if it has value with F because of type inference
     */
    var myBoolean=true
    myBoolean=false

    //Characters
    //Char has only one char character no matter what it is letter or digit
    val letterChar: Char='N'
    val digitChar='2'

    //Strings
    //String is a collection of Characters
    val myStr="Hello Nayan"
    val firstCharInStr=myStr[0]
    println("First Character $firstCharInStr")

    //myStr.length-1 because length starts from 0
    val lastCharInStr=myStr[myStr.length-1]
    println("Last Character $lastCharInStr")

    //Some Basic Exercise
    var courseName="Android Masterclass"
    val leet=13.37F
    val pi=3.14159265358979
    var age: Short=25
    var year=2020
    var phoneNumber: Long=1881234567
    var isGood=true
    var firstCharecter='a'

    println("String $courseName")
    var thirdCharInCourseName=courseName[2]
    println("Third Character $thirdCharInCourseName")
    println("Float $leet")
    println("Double $pi")
    println("Short $age")
    println("Int $year")
    println("Long $phoneNumber")
    println("Boolean $isGood")
    println("Char $firstCharecter")

    //Arithmetic Operators(+,-,*,/,%)
    var result=5+3
    //result-=3
    //result/=3
    //result*=3
    //% get the remainder
    result%=3
    println(result)

    // also we can do like this
    val a=11.0
    val b=3
    var resultInt=7
    //because resultInt is Int to we convert a+b into Int by toInt() otherwise it will show error
    resultInt=(a+b).toInt()
    println(resultInt)

    //The result will be in double because a is double type variable
    var resultDouble= a/b
    println(resultDouble)

    //Comparision Operators(==, !=, >, <, >=, <=)
    val isEqual= 2==3
    println("isEqual $isEqual")

    val isNotEqual= 2!=2
    println("isNotEqual $isNotEqual")

    //Also we can do like this there is no need to create variable
    println("2greater3 ${2>3}")
    println("2lower3 ${2<3}")
    println("2greaterEqual3 ${2>=3}")
    println("2lowerEqual2 ${2<=2}")

    //Assignment Operators(+=, -=, *=, /=, %=)
    var myNum=4
    myNum+=3
    myNum-=2
    //same as myNum=myNum-2
    println(myNum)

    //Increment & Decrement Operators (++, --)
    myNum++
    println("myNum is $myNum")
    //myNum++ means that it increase value after use
    println("myNum is ${myNum++}")
    //++myNum means that it increase value before use
    println("myNum is ${++myNum}")

    myNum--
    println("myNum is $myNum")
    //decrement before use
    println("myNum is ${--myNum}")
    //decrement after use
    println("myNum is ${myNum--}")
    println("myNum is $myNum")

    //If Statement
    var agePerson=17

    if(agePerson>=21){
        println("You may drink in US now")
    }else if (agePerson>=18){
        println("You may vote now")
    }else if(agePerson>=16){
        println("You may drive now")
    }else{
        println("You are too young")
    }

    var heightPerson1=190
    var heightPerson2=170

    if(heightPerson1>heightPerson2)
        println("Use raw force")
    else if(heightPerson1==heightPerson2)
        println("Use your power technique 1337")
    else
        println("Use technique")

    var isRainy=true
    if(isRainy)
        println("Weather is cool")
}