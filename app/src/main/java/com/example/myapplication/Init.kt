package com.example.myapplication

import android.health.connect.datatypes.units.Length

fun main() {
    /*println("Hello world")

    var myName = "Atul"
    var last_name : String = "Varghese"

    myName = "Atul T"

    val id = 113

    println("Hello my name is $myName $last_name and my id is $id")


    var age : Int = 26
    var doubleAge : Double = age.toDouble()

    var day : Int = 10

    var arr = arrayOf(1,3,4,5,6,6,8,5,3, "hello")*/

    /*for (i in 0..arr.size - 1){
    println("Index is $i and value is ${arr[i]}")
    }*/
    /*for (c in arr) {
//        println("Enter and element: ")
//        val days = readln().toInt()
        when (c) {
            1 -> println("Monday")
            2 -> {
                println("Tuesday")
                println("Holli day")
            }
            3, 4, 5 -> println("Other days in the week")
            in 8..15 -> println("Not found")
            else -> println("Not in list")
        }
    }

    arr.forEach {
        println(it)
    }*/

    /*var mutarr = mutableListOf<Int>(1,2,3,5,3,5,2,5,10)
    mutarr.add(12)


    var i = 100
    while (i > 0){
        println(i)
        i -= 2
    }*/

    var myString : Any? =  10
//    myString = "String"

//    println("The length of the string is ${myString?.length}")
    //    !! non null assertion operator
    /*println("This will give and exception ${myString!!.length}")*/
    //    elvis operator ?:  --> if lhs is null will give the rhs
    /*var res = myString?.length ?: -1
    println(res)*/


//    as - cast operator and  as? safe cast operator

    /*var college : String = "IIT"
    var age : Int ?  = college as? Int
    println(age)*/

/*//    college = 123
    age = college as Int
    println(age)*/

    /*college?.let {
        println(it.length)
    }*/

    /*playing()
    println(sumTwoNumbers(1,3))
    println(getTypeFun(myString))
    println( sumTwoNumbers())
    println(sumTwoNumbers(b=0))
    println(sumTwoNumbers(a=0))*/

    /*var myLambdaAdd : (Int, Int) -> Int = {a,b -> a+b}
    //    Unit is a void return type
    var myLambdaNR : (Int, Int) -> Unit = {a,b -> (a+b).toString()}

    println(myLambdaAdd(1,2))
    println(myLambdaNR(1,2))


    fun myHigherOrderFun(a: Int, b : Int , myFun : (Int, Int) -> Int) : Int {
        return myFun(a,b)
    }

    println( myHigherOrderFun(4, 3, myLambdaAdd))*/
    
    /*fun tigerEating(food : String){
        println("Tiger is eating $food")
    }
    
    fun Animal(fav_food: String , myFun : (String) -> Unit){
        myFun(fav_food)
    }
    
    //    Reflection (passing a normal function)
    //    Animal("Meat", ::tigerEating)

    fun newAnimal(): (String) -> Unit {
        return  ::tigerEating
    }

    var res = newAnimal()
    res("Veg")*/

    /*// Anonymous function
    var anonym = fun (food : String){
        println("Eating $food")
    }*/


    /*var my_arr = arrayListOf(1,2,3,4,5,6,7,8,9)
    println(my_arr.filter { it % 2 == 0})
    println(my_arr.map { it * 10})
    println(my_arr.reduce { red , current_element -> red + current_element })
    println(my_arr.reduce { red , current_element ->
        println("Current Elem is : $current_element")
        println("Now the result is : $red")
        red + current_element })


    println(my_arr.filter {
        it % 2 == 0
    }.map {
        it * 2
    }.reduce {
             acc, i -> acc + i
    })*/


    /*fun findMax(a : Int, b : Int , c : Int) : Int = if(a > b) a else c
    println(findMax(12,3, 13))

    fun showArea(length: Int, breadth: Int) : Int {
        fun calculateArea() : Int = length * breadth
        return calculateArea()
    }
    println("Area is : ${showArea(5,5)}")*/

    //    println(myage)

    /*var tiger = Tiger()
    tiger.tigerEating()
    var cheeta = Tiger.Cheeta()*/

    /*var tiger_constructor =  Tiger(12, "Bangalore")
    tiger_constructor.animalEating()
    var tiger =  Tiger(15)*/

    var t =  Tiger("Bangalore", 23)

}


/*
// custom accessor
val myage : Int
    get() {
        return 100
    }

fun playing(): Unit{
    println("Playing")
}

fun sumTwoNumbers(a : Int = 10, b : Int = 20) : Int{
    return  a + b
}

fun getTypeFun(myObj : Any?) : String{
    return when(myObj){
        is String -> "String"
        is Int -> "Integer"
        else  -> "Unknown Type"
    }

}*/


/*class Tiger {

    var name = "Cheeta"
    fun tigerEating(){
        println("Tiger is eating")
    }

    class Cheeta {
        fun cheetaEating(){
            println("Cheeta eating")
        }

    }

}*/


open class Animal() {

    init {
        println("Init animal")
    }

    constructor(age: Int) : this() {
        println("This is a Tiger from secondary constructor have age $age")
    }
    open fun animalEating(){
        println("Animal Eating")
    }
}
//internal -- module
// public  -- anywhere
// protected -- inheritance
// private -- class
internal class Tiger(age: Int) : Animal(){

    var age = 0;
    init {
        this.age = age
    }

    constructor(age : Int, place: String) : this(age){
        println("age of sec constructor is $age, place $place")
    }

    constructor(city : String, num : Int) : this(num, city){
        println("I am from the city $city with an id of $num")
    }

    override fun animalEating(){
        super.animalEating()
        println("Age of tiger is $age")

    }
}
