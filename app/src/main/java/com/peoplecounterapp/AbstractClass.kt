package com.peoplecounterapp

fun main(){

    var human=Human("Nayan","India",60.0,28.0)
    var dog=Dog("Shadow","Africa",25.0,30.0)

    //we can't create instance of abstract class it will show error-
    // cannot create an instance of abstract class
  //  var mammel=Mammel("Nayan","India",60.0)

    human.run()
    dog.run()

    human.breath()
    dog.breath()
}

/*
A class and some of its members may be declared abstract.
An abstract member does not have an implementation in its class.
 */
abstract class Mammel(var name: String, var origin: String,var  weight: Double)  {
    //Abstract property(must be overridden by subclasses
    abstract var maxSpeed: Double

    //abstract method can't have body if you did then it will show error
    //abstract method(must be overridden by subclasses
    abstract fun run()
    abstract fun breath()

    //concrete(Non-abstract) method
    fun displayDetails(){
        println("Name $name Origin $origin and Weight $weight")
    }
}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammel(name, origin, weight){
    override fun run() {
        println("Run with two legs")
    }

    override fun breath() {
        println("Breath with mouth and nose")
    }
}

class Dog(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammel(name, origin, weight){
    override fun run() {
      println("Run with 4 legs")
    }

    override fun breath() {
        println("Breath with nose")
    }
}

//You don't need to annotate an abstract class or function with open.
//You can override a non-abstract open member with an abstract one.
open class Polygon(){
    open fun draw(){

    }
}

abstract class Rectangle: Polygon(){
    abstract override  fun draw()
}