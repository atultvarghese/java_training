package com.example.myapplication

fun main() {
    println("Hello world")

    var myName = "Atul"
    var last_name : String = "Varghese"

    myName = "Atul T"

    val id = 113

    println("Hello my name is $myName $last_name and my id is $id")


    var age : Int = 26
    var doubleAge : Double = age.toDouble()

    var day : Int = 10

    var arr = arrayOf(1,3,4,5,6,6,8,5,3, "hello")

    for (i in 0..arr.size - 1){
    println("Index is $i and value is ${arr[i]}")
    }
    for (c in arr) {
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
    }


}

