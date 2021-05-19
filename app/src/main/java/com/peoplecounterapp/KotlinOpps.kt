package com.peoplecounterapp

fun main(){
    //creating object of class and call
    //agrument
    var nayan= Person("Nayan","Gupta")
    //when already have value
    var gaurav=Person()
    //change only firstName
    var naveen=Person(firstName = "Naveen")
    var bansal=Person(lastName = "Bansal")

    //for MobilePhone class
    var samsung= MobilePhone("Android","Samsung","Galaxy S20 Ultra")
    var iPhone=MobilePhone("ios","Apple","iPhone 12")
    var honor=MobilePhone()
    var vivo=MobilePhone(brand = "Vivo",model = "Note 5")
}

//you can make constructor like this
/*
class Person constructor(firstName: String, lastName: String) {
}*/
//or

//class
//also class Person(firstName: String, lastName: String){}
class Person(firstName: String="Gaurav", lastName: String="Garg"){

    //Initializer
    init {
        println("Initialize a new Person with FirstName=$firstName and LastName=$lastName")
    }
}


//class MobilePhone(osName: String, brand: String, model: String){
class MobilePhone(osName: String="Android", brand: String="Honor", model: String="9 Lite"){

    init {
        println("The Phone $model from $brand uses $osName as its Operating System")
    }

}