fun main(){
    val points = arrayOf(1,2,3,4)
    val newPoints = points.plusElement(5)
    newPoints.forEach{ point -> println("$point")}
    val filtered = newPoints.filter{ it>=5 }
    println(filtered)
    for(it in filtered)
        println(it)
}