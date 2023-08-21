import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)
    println("Enter the length:")
    var length=reader.nextDouble()

    println("Enter the width")
    var width=reader.nextInt()

    var area=length*width
    println("The area of the rectangle is $area")


}