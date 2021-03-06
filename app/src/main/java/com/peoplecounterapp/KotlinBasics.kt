package com.peoplecounterapp

import javax.xml.transform.dom.DOMLocator

fun main() {
    println("Hello World!")

    //val is immutable variable that could be initialized once not be change
    //TODO: Add new functionality
    /*
    This
    is a multiline
    comment
     */
    val myName = "Nayan"
    /*If we change the value of val variable
    the it will be compile-time-error.
    Our IDE tell us that we can't overwrite 'val'
    myName="Neha"
     */
    println("Hello $myName")

    //var is mutable variable that could be change at run time
    // here hisName is address and Sumit is value of this that is stored init.
    var hisName = "Gaurav"
    //The value Sumit will be change at run-time
    hisName = "Sumit"
    //String Concatenation
    println("Hi" + hisName)
    //This is same as String Concatenation
    //String Interpolation
    println("Hi $hisName")

    //Kotlin is a typed language so it know the type of variable
    //type String
    val name = "Nayan"
    //type Int
    //type inference finds out the type from context
    //It is mandatory to declare a variable otherwise it will error
    val myAge = 32

    //Integer Number Type: Byte(8 bit), Short(16 bit),
    // Int(32 bit) and Long(64 bit)
    val myByte: Byte = 23
    val myShort: Short = 123
    val myInt: Int = 1234
    val myLong: Long = 234_456_344_345_345

    //Floating Number Type: Float(32 bit) and Double(64 bit)
    /*If you want to create Float type variable
     then it is mandatory to put F
     at the last of number otherwise it will show error and also recognize number as Double
    */
    val myFloat: Float = 13.67F
    val myDouble: Double = 3.57489570802802

    //Boolean he type Boolean is used to represent logical values
    //It have two type values true or false

    /*there is no need to assign Boolean, String, Double, Int
    and Float if it has value with F because of type inference
     */
    var myBoolean = true
    myBoolean = false

    //Characters
    //Char has only one char character no matter what it is letter or digit
    val letterChar: Char = 'N'
    val digitChar = '2'

    //Strings
    //String is a collection of Characters
    val myStr = "Hello Nayan"
    val firstCharInStr = myStr[0]
    println("First Character $firstCharInStr")

    //myStr.length-1 because length starts from 0
    val lastCharInStr = myStr[myStr.length - 1]
    println("Last Character $lastCharInStr")

    //Some Basic Exercise
    var courseName = "Android Masterclass"
    val leet = 13.37F
    val pi = 3.14159265358979
    var age: Short = 25
    var year = 2020
    var phoneNumber: Long = 1881234567
    var isGood = true
    var firstCharecter = 'a'

    println("String $courseName")
    var thirdCharInCourseName = courseName[2]
    println("Third Character $thirdCharInCourseName")
    println("Float $leet")
    println("Double $pi")
    println("Short $age")
    println("Int $year")
    println("Long $phoneNumber")
    println("Boolean $isGood")
    println("Char $firstCharecter")

    //Arithmetic Operators(+,-,*,/,%)
    var result = 5 + 3
    //result-=3
    //result/=3
    //result*=3
    //% get the remainder
    result %= 3
    println(result)

    // also we can do like this
    val a = 11.0
    val b = 3
    var resultInt = 7
    //because resultInt is Int to we convert a+b into Int by toInt() otherwise it will show error
    resultInt = (a + b).toInt()
    println(resultInt)

    //The result will be in double because a is double type variable
    var resultDouble = a / b
    println(resultDouble)

    //Comparision Operators(==, !=, >, <, >=, <=)
    val isEqual = 2 == 3
    println("isEqual $isEqual")

    val isNotEqual = 2 != 2
    println("isNotEqual $isNotEqual")

    //Also we can do like this there is no need to create variable
    println("2greater3 ${2 > 3}")
    println("2lower3 ${2 < 3}")
    println("2greaterEqual3 ${2 >= 3}")
    println("2lowerEqual2 ${2 <= 2}")

    //Assignment Operators(+=, -=, *=, /=, %=)
    var myNum = 4
    myNum += 3
    myNum -= 2
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
    var agePerson = 17

    if (agePerson >= 21) {
        println("You may drink in US now")
    } else if (agePerson >= 18) {
        println("You may vote now")
    } else if (agePerson >= 16) {
        println("You may drive now")
    } else {
        println("You are too young")
    }

    var heightPerson1 = 190
    var heightPerson2 = 170

    if (heightPerson1 > heightPerson2)
        println("Use raw force")
    else if (heightPerson1 == heightPerson2)
        println("Use your power technique 1337")
    else
        println("Use technique")

    var isRainy = true
    if (isRainy)
        println("Weather is Good")

    //When statement
    /*Kotlin when statement is replacement of
    switch case from other language like c,c++ and java
     */
    //It is compact and powerful than switch statement
    var season = 3
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    //We can do like this using in keyword and ..
    var month = 12
    when (month) {
        // also write as in 3..5
        3, 4, 5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        // also write as in 12..2 or 12,1,2
        in 12 downTo 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    agePerson = 21
    when (agePerson) {
        //!in is same as not saying that means is not between 0 to 20
        !in 0..20 -> println("You may drink in US now")
        in 18..20 -> println("You may vote now")
        16, 17 -> println("You may drive now")
        else -> println("You are too young")
    }

    var x: Any = 13.37F
    when (x) {
        //!is means not
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is not the above")
    }

    //while loop executes the code repeatedly until the given condition is true
    var i = 1
    while (i <= 10) {
        print("$i ")
        i++
    }

    //in decreasing order
    i = 100
    while (i >= 0) {
        print("$i ")
        i -= 2
    }
    // \n break the line
    println("\nwhile loop is done")

    var feltTemperature = "Hot"
    var roomTemperature = 32
    while (feltTemperature == "Hot") {
        roomTemperature--
        if (roomTemperature < 20) {
            feltTemperature = "Comfy"
            println("It's comfy now")
        }
    }

    //do while loop
    // i=1
    i = 15
    do {
        print("$i ")
        i += 3
    } while (i <= 10)
    println("\ndo while is done")

    //for loop
    for (num in 1..10) {
        print(num)
    }
    println()

    //also write like this
    for (i in (1).until(10)) {// same as for(i in 1 until 10)
        print(i)
    }
    println()

    for (i in 10 downTo 1) {// same as for(i in (10).downTo(1))
        print(i )
    }
    println()

    for (i in (10).downTo(1) step 2) {// same as for(i in 10 downTo 1 step 2)
        print(i )
    }
    println()

    for (i in 1 until 10 step 3) {
        print(i )
    }
    print("\nfor loop is done\n")

    //exercise
    for (num in 0..10000) {
        if (num == 9001)
            println("IT'S OVER 9000!!!")
    }

    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid") {
        humidityLevel -= 5
        println("humidity decreased")
        if (humidityLevel < 60) {
            humidity = "Comfy"
            println("It's comfy now")
        }
    }

    //call a function
    myFunction()
    //where 2 and 8 are agrument
    /*
    parameter and Argument are two different things
    parameter are given in data type
    argument are value of that parameter
     */
    var addResult=addFunction(2,8)
    println("Result is $addResult")

    var avgResult= avgFunction(4.90,19.75)
    println("Average is $avgResult")

    //nullable in kotlin
    var heyName: String="Nayan"
    //we can't put null value because it is not nullable variable
    //heyName=null -> compilation error
    val len=heyName.length
    println(heyName.toLowerCase())
    println("Length is $len")

    //for nullable variable only we need to put ? after Data type like(String?, Int?..)
    //then this variable can also be null
    var nullableName: String?="Nayan Gupta"
    //nullableName=null

    //it will show error because this value can also be null so we make is null safe by adding ? before .
    //In kotlin we use only single line of code for checking null variable
    val nullableLen=nullableName?.length
    println("Nullable Length is $nullableLen")
    //safe called operator(?.)
    println(nullableName?.toLowerCase())
    // when nullableName=null then length is null
    // and also if statement like this
    nullableName?.let { println("Length is ${it.length}")}

    //In Java we check the null variable by using multiple line of code
   /* if(nullableName!=null){
        val nullableLen=nullableName.length
        println("Nullable Length is $nullableLen")
    }else{
        null
    }*/


    //?: Elvis Operator and !! Not Null-Assertion
    nullableName="Nayan"
   // nullableName=null
    // if nullableName is not null then it will print Nayan but it's value is null then it set the default value Guest
    //with the use of elvis operator ?:
    heyName=nullableName?:"Guest"
    println("$heyName")

    //!! not null assertion
    /*
    The !! operator converts a nullable type to a
    non-null type, and throws a NullPointerException
    if the nullable type holds a null value.
    This is risky, and you should only use it if
    you are 100% certain, that there will be a value in
    the variable.
     */
    var nullValue: String?=null
    //nullValue!!.toLowerCase()// null pointer exception
    nullValue="NAYAN"
    println(nullValue.toLowerCase())

    for(i in 1..100){
        if(i%3==0)
            print("Fizz$i ")
        else if(i%5==0)
            print("Buzz$i ")
        else if(i%3==0 && i%5==0)
            print("FizzBuzz$i ")
        else
            print("unknown")

    }
}

//function
fun myFunction(){
    println("This is my function")
}

//method is different from function it created within a class
//here function is not created in a class
//parameter function
//a function with return type int
fun addFunction(a: Int,b: Int) : Int{
    return a+b
}

//function with double return type
fun avgFunction(a: Double,b: Double) : Double{
    return (a+b)/2
}

