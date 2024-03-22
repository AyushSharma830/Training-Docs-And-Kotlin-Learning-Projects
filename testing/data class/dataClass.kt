//class Person(val name : String, val age : Int){
//    override fun hashCode() : Int{  //return type is set to be Int you can not return String even while overriding
//        return 5
//    }
//}

//data class Person(val name : String, val age : Int){
//    override fun hashCode(): Int {  //again same case as above we can't overrirde with string
//        return 5
//    }
//}

//class Person(val name : String, val age : Int){
//    override fun toString(): String {
//        return "Person(name=$name, age=$age)"
//    }
//}

//data class Person(val name : String, val age : Int)

open class Person(val name : String, val age : Int){
    override fun toString(): String {
        return "Person(name=$name, age=$age)"
    }
}

class Employee( name : String,  age : Int, val id : Int) : Person(name,age){
    override fun toString(): String {
        return "Employee(name=$name, age=$age, id=$id)"
    }
}

fun main(){
//    val person1 = Person("Ayush",23)
//    println(person1.hashCode())
//    println(person1.toString())
    val employee1 = Employee("Ayush",23,123)
    println(employee1.toString())
}