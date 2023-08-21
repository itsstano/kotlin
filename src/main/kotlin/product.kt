import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)
    println("Enter the first number:")
    var fnumber=reader.nextInt()

    println("Enter the second number")
    var lnumber=reader.nextInt()
    
    var product=fnumber*lnumber
    println("The product of the two numbers is $product")



}