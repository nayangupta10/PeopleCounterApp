package com.peoplecounterapp

//Nested class is such class which is created inside the another class
/*
In kotlin, a nested is by default static so its data member and
member function can be accessed without creating an object of the class
Nested class can not be access the data members of outer class
*/
class OuterClass{
    //outer class code
     var outerDescription: String="code of outer class"
    private var name: String="Nayan Gupta"
    fun outerClassFunction(){
        println("Name is $name")
    }

    class NestedClass{
        //nested class code
        var description: String="code inside the nested class"
        var id: Int=101

        fun nestedClassFunction(){
            //println("name $name")// cannot access the outer class member
            println("Id: $id")
        }
    }
}

//An Inner class is class which is created inside another class with keyword inner
/*
In other words, a nested class which is marked as "inner" is called Inner class
Inner class cannot be declared inside interface or non-inner nested class
The advantage of Inner class over Nested class is that,
it is able to access members of its outer class even if it is private
The inner class keeps a reference to an object of its outer class
*/
class OuterInner{
    //outer class code
    private var name: String="Nayan Gupta"

    inner class InnerClass{
        //inner class code
        var description: String="code inside inner class"
        var id: Int=101

        fun innerClassFunction(){
            println("Name is $name") //access the private outer class member
            println("Id is $id")
        }
    }

}

fun main(arg: Array<String>){

    println(OuterClass().outerDescription)
    var outerObj=OuterClass()
    outerObj.outerClassFunction()

    //nested class must be initialized
    println(OuterClass.NestedClass().description) // access property

    var obj=OuterClass.NestedClass() // object creation
    obj.nestedClassFunction() // access member function
    // or can access without creating object because of static OuterClass.NestedClass().access()

    println(OuterInner().InnerClass().description) // access property
    var objInner=OuterInner().InnerClass() // object creation
    objInner.innerClassFunction() // access member function
}
