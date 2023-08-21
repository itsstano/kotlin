open class Shape{
    fun area(){
        println(560)
    }
    fun circumference(){
        println(156)
    }
}
class Rectangle:Shape() {
    var length = 56
    var Breadth = 10

    fun getlength() {
        println(length)
    }

    fun getBreadth() {
        println(Breadth)
    }
}
class Circle:Shape(){
    var radius=14

    fun getradius(){
        println(radius)
    }
}
fun main(){
    var R=Rectangle()
    println(R.length)

    var C=Circle()
    println(C.circumference())
}