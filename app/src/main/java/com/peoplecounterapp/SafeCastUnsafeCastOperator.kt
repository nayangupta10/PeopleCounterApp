package com.peoplecounterapp

fun main(){

    //Sometimes it is not possible to cast a variable and it throws an exception, it is called unsafe operator
    //The unsafe operator is performed by the infix operator as
    //The nullable string(String?) cannot be cast the non-nullable string, it throws an exception
    val unsafeObj: Any?=null
   // val unsafeStr: String=unsafeObj as String // throws an exception NullPointerException null cannot be cast non-null type
  //  println(unsafeStr)

    //generates ClassCastException
    // typing to cast an integer value of Any type into a String type leads to a ClassCastException
    val unsafeObj1: Any?=1234
   // val unsafeStr1: String=unsafeObj1 as String // throws ClassCastException integer cannot be cast to String
    //println(unsafeStr1)

    //Nullable for casting to work
    val unsafeObj3: Any?="String unsafe cast"
    val unsafeStr3: String?=unsafeObj3 as String? //work even if obj of Any is null then return null
    println(unsafeStr3)

    // Safe Cast Operator: as? provides safe cast operation to safely cast to a type
    //It returns null if casting is not possible rather than throwing an ClassCastException
    val location: Any?="Delhi"
    val safeStr: String?=location as? String
    val safeInt: Int?=location as? Int // not throwing an exception because of safe as? operator
    println(safeStr)
    println(safeInt) // return null but not exception


}
