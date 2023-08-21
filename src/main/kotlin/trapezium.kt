import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    //1/2(a+b)*h
     println("Enter a:")
    var a=reader.nextDouble()

    println("Enter b:")
    var b=reader.nextDouble()

    println("Enter h:")
    var h=reader.nextDouble()

    var area=(a+b)/2*h
    println("The area of the trapezium is $area")


}