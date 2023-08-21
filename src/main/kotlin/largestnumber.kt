import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter the first number:")
    var num1=reader.nextDouble()

    println("Enter the second number")
    var num2=reader.nextDouble()

    println("Enter the third number")
    var num3=reader.nextDouble()

    if(num1>num2 && num1>num3){
        println("$num1 is the largest")
    }
    else if(num2>num1 && num2>num3){
        println("$num2 is the largest")
    }
    else{
        println("$num3 is the largest")
    }
}