package com.peoplecounterapp

open class Base() {
    var a=1 //public by default
    private var b=2 //private to Base class
    protected open val c=3 //visible to Base class and to Sub class
    internal val d=4 //visible inside the same module
    protected fun e(){
        println("Hello")
    } //visible to Base class and to Derived class
}

open class Derived: Base(){

     fun f(){
         println("a $a c $c d $d")
         e()//a,c,d and e() of Base class are visible
         // b is not visible
     }

    override val c=3// c is protected
}

fun main(){
    val base=Base()
    base.a
    base.d // a and d are visible
    //b,c and base.e() not visible
    val derived=Derived()
    derived.a
    derived.d// c not visible
    derived.f()

}