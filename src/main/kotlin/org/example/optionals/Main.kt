package org.example.optionals

fun main() {
    val martin = Person("Martin", "martin@gmail.com")
    val stefan = Person("Stefan")

    println(martin.info)
    println(stefan.info)
}

data class Person(val name: String, val email: String? = null) {
    val info: String
        get() = "Name: $name, Email: ${email ?: "N/A"}"
}
