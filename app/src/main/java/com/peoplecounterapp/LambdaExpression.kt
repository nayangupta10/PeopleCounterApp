package com.peoplecounterapp

/*
    Lambda(Expression) a function which has no name
    Lambda expression and anonymous function are 'function literals'
    i.e function that are not declared, but passed immediately as an expression
    It defined with {} which takes variables as a parameter(if any) and a body of a function
    a body of the function is written after the variable(if any) followed by -> operator
    syntax: { variable -> body_of_lambda}
 */
fun main(){

    //normal function
    fun addNumber(a: Int, b: Int){
        println(a+b)
    }
    addNumber(4,10)

    //lambda expression
    val sum:(Int,Int) -> Int ={a: Int, b: Int -> a+b}
    println(sum(4,5))

    //even shorter
    val sum1={a: Int, b: Int -> println(a+b)}
    sum1(1,6)
}