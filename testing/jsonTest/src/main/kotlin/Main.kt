package org.example

//here I have used kotlinx.serialization library to work with json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class Person(
    @SerialName("full_name")
    val fullName: String,
    val age: Int,
    val city: String
)

fun main() {
    val jsonString = """{"full_name":"John Doe","age":30,"city":"New York"}"""

    // Parsing JSON string to Kotlin object
    val person: Person = Json.decodeFromString(jsonString)

    // Accessing values from the parsed object
    println(person)

    val json_String: String = Json.encodeToString<Person>(person)
    println(json_String)


    val json__String = """{"name":"Alice","age":25,"city":"Wonderland"}"""
    println(json__String)
}