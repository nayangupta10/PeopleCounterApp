package com.peoplecounterapp

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

    //shadowing
    shadowingFunction(5)
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

    init {
        println("The Phone $model from $brand uses $osName as its Operating System")
    }
}

//where a is a parameter
// output is 41 because of shadowing it will take local variable not argument
fun shadowingFunction(a: Int) {

    //here a is variable
    var a = 41
    println("$a")
}

