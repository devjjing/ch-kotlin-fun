package org.example.hello

fun main() {
    val hello = "Hello World"
    println(hello)
    thisIsFun()
    lemmeCountJustForFun()
}

fun thisIsFun() {
    println("ThisIsMoreFun")
}

fun lemmeCountJustForFun(){
    for (i in 1..100) {
        println(i)
    }
}

