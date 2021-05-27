package com.peoplecounterapp

fun main(){
    var audiA3=MyCar(200.0,"A3","Audi")
    var teslaS=MyElectricCar(240.0,"S-model","Tesla",85.0)

    teslaS.drive()
    teslaS.brake()
    audiA3.brake()
}
/*
Interfaces in Kotlin can contain declarations of abstract methods,
as well as method implementations.
What makes them different from abstract classes is that interfaces
cannot store state. They can have properties but these need
to be abstract or to provide accessor implementations.
*/
interface Drivable{
    var maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The Drivable is braking")
    }

}

open class MyCar(override var maxSpeed: Double,brand: String, name: String): Drivable{

    // so make it open for override
    open var range: Double=0.0

    //also for override make is open
    open fun extendedRange(amount: Double){
        if(amount>0){
            range += amount
        }
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }

    //override fun drive(): String ="Driving the interface drivable"
    override fun drive(): String {
        return "Driving the interface drivable"
    }
}

/*
All class of kotlin have a common super class Any, that is default
for a class with no supertypes declared- class NewCar
Any has 3 method - equal(), hashcode(), and to String(). So they
are defined for all kotlin classes
 */

//for extending NewCar we have to make NewCar open
//Sub Class, Derived Class, Child Class of NewCar
class MyElectricCar(maxSpeed: Double, brand: String, name: String, batteryLife: Double=85.0): MyCar(maxSpeed, brand, name){

    //we can't override super class fun and variable so to do this we have to make that open
    override var range: Double=batteryLife*6

    override fun drive(distance: Double) {
        super.drive(distance)
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String{
        println("Drove for $range KM on electricity")
        return "Drove for $range KM on electricity"
    }

    //if we call this function then firstly it call super.brake() - "The Drivable is braking"
    //then call it- "Brake is inside the electric car
    override fun brake() {
        super.brake()
        println("Brake is inside the electric car")
    }
}