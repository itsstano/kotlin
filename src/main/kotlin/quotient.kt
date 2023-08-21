import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter the first number")
    var fnumber=reader.nextInt()

    println("Enter the second number")
    var lnumber=reader.nextInt()

    var quotient=fnumber/lnumber
    println("The quotient of the two numbers is $quotient")

    var remainder=fnumber%lnumber
    println("The remainder of the two numbers is $remainder")



}