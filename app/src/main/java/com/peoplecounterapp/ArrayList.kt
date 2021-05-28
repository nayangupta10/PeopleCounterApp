package com.peoplecounterapp

import kotlin.collections.ArrayList

fun main(){
    val arrayList=ArrayList<String>()//create an empty arrayList
    arrayList.add("One") // Adding an object in arrayList
    arrayList.add("Two")
    println("....print arrayList....")
    for(i in arrayList){
        println(i)
    }
    println(arrayList[0])

    //ArrayList using Collection
   val arrayList1: ArrayList<String> = ArrayList<String>(5)
    var mutableArrayList: MutableList<String> = mutableListOf<String>()

    mutableArrayList.add("One")
    mutableArrayList.add("Two")
    mutableArrayList.add("Three")
    mutableArrayList.add("Four")
    mutableArrayList.add("Five")

    arrayList1.addAll(mutableArrayList)
    println("....print arrayList")

    //can iterate all elements of ArrayList
    val itr=arrayList1.iterator()
    while (itr.hasNext()){
        //goes to next element
        println(itr.next())
    }
    println("Size of ArrayList: ${arrayList1.size}")
    println(arrayList1.get(1))//arrayList1[1]





}
class ArrayList<T> {
}