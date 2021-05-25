package com.peoplecounterapp

import java.lang.IllegalArgumentException

fun main() {
    //creating object of class and call
    //agrument
    var nayan = Person("Nayan", "Gupta", age = 32)
    //age is overridden from age=32
     nayan.age = 31
     println("Nayan's age is ${nayan.age}")
     nayan.stateHobby()

     //when already have value
     var gaurav = Person()
     gaurav.hobby = "Play mobile game"
     gaurav.age = 34
     println("Gaurav's age is ${gaurav.age}")
     gaurav.stateHobby()

     //change only firstName
     var naveen = Person(firstName = "Naveen")
     var bansal = Person(lastName = "Bansal")

     //for MobilePhone class
     var samsung = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
     var iPhone = MobilePhone("ios", "Apple", "iPhone 12")
     var honor = MobilePhone()
     var vivo = MobilePhone(brand = "Vivo", model = "Note 5")
    vivo.changeBattery(3)

     //shadowing
     shadowingFunction(5)

    var myCar = Car()
    println("Owner is ${myCar.owner}")
    println("Brand is ${myCar.brand}")
    myCar.maxSpeed = 240
    println("Brand is ${myCar.maxSpeed}")
    //we can not assign value because setter is private
    // myCar.myModel="M3"
    println("Model is ${myCar.myModel}")

    var newCar=NewCar("Audi","A3")
    var electricCar=ElectricCar("Tesla","S-3",85.0)

    //this fun is not in this class but due to inheritance it can extend all features of super class NewCar
    electricCar.extendedRange(200.0)
    electricCar.drive()

    //polymorphism
    //call from electric class
    electricCar.drive(200)
    //call from super class
    newCar.drive(300)

}

//you can make constructor like this
/*
class Person constructor(firstName: String, lastName: String) {
}*/
//or

//class
//also class Person(firstName: String, lastName: String){}
// this is primary constructor
class Person(firstName: String = "Gaurav", lastName: String = "Garg") {
    //Member variable - properties
    var age: Int? = null
    var hobby: String = "Watch YouTube Video"

    //create a new member variable
    var firstName: String? = null

    //Initializer
    init {
        this.firstName = firstName
        println("Initialize a new Person with FirstName=$firstName and LastName=$lastName")
    }

    //member secondary constructor
    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age;
        println("A Person whose Name is $firstName $lastName and Age $age")
    }

    //Member function - method
    fun stateHobby() {
        //for access firstName create a member variable firstName and
        // assign with this.firstName(variable)=firstName(parameter of primary constructor)
        println("$firstName\'s hobby is $hobby")
    }
}

//class MobilePhone(osName: String, brand: String, model: String){
class MobilePhone(osName: String = "Android", brand: String = "Honor", model: String = "9 Lite") {
    private var battery=30

    init {
        println("The Phone $model from $brand uses $osName as its Operating System")
    }

    //exercise
    /*
    Add a member to it, which indicates how much battery is left
     (call it "battery". Initialize this value with a number between 0 and 50.Then add a function
    "chargeBattery" Which needs details about how much was charged.
    It should print out how much battery the phone had before,
    how much was charged and how much it has now.
    Create an Object of the class and call this function. Charge the battery by 30.*/
    fun changeBattery(chargedBy: Int){

        println("Battery was at $battery and is at ${battery+chargedBy} now ")
        battery += chargedBy
    }
}

//where a is a parameter
// output is 41 because of shadowing it will take local variable not argument
fun shadowingFunction(a: Int) {

    //here a is variable
    var a = 41
    println("Value of a is $a")
}

class Car {
    //lateinit - it should allow us to initialize it later
    lateinit var owner: String

    val brand: String = "BMW"
        //custom getter
        get() {
            //where field is like brand
            return field.toLowerCase()
        }

    // value
    /* We use value as the name of the setter parameter. T
    his is the default convention in Kotlin but you’re free to use any other name if you want.
    The value parameter contains the value that a property is assigned to.
    For example, when you write user.name = "Elon Musk",
    the value parameter contains the assigned value "Elon Musk".*/

    // 2. Backing Field (field)
    /* Backing field helps you refer to the property
    inside the getter and setter methods.
    This is required because if you use the property
    directly inside the getter or setter then you’ll
    run into a recursive call which will generate
    a StackOverflowError.*/
    var maxSpeed: Int = 280
        //default getter
        get() = field
        //custom setter
        set(value) {
            //where value is like 280
            field = if (value > 0) value else throw IllegalArgumentException("MaxSpeed can not be less than 0")
        }

    var myModel: String = "M5"
        //private set - it could be access within class
        private set


    init {
        //we can't assign value because private set but we can from here
        this.myModel = "M3"
        //lateinit variable
        this.owner = "Naveen"
    }
}

//Inheritance
// a class in final by Default for inherit it we make it open by open keyword
//Super class, Base Class, Parent Class of NewCar -
// whose all features are inherited by its child class
 open class Vehicle(){

}

//Sub Class, Derived Class, Child Class of Vehicle
//Super class, Parent Class, Base Class of ElectricCar
//sealed class - can't extends it
open class NewCar(brand: String, model: String){

    // so make it open for override
    open var range: Double=0.0

    //also for override make is open
    open fun extendedRange(amount: Double){
        if(amount>0){
            range += amount
        }
    }

   open fun drive(distance: Int){
        println("Drove for $distance KM")
    }
}

//for extending NewCar we have to make NewCar open
//Sub Class, Derived Class, Child Class of NewCar
class ElectricCar(brand: String, model: String, batteryLife: Double=85.0): NewCar(brand, model){

    //we can't override super class fun and variable so to do this we have to make that open

    override var range: Double=batteryLife*6

    override fun drive(distance: Int) {
        super.drive(distance)
        println("Drove for $distance KM on electricity")
    }

    fun drive(){
        println("Drove for $range KM on electricity")
    }
}



