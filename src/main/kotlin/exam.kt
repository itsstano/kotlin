import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter the Student score:")
    var score=reader.nextInt()

    if (score>80 && score<=100){
        println("Student score is an A")
    }
    else if (score>=70 && score<80){
        println("Student score is a B")
    }
    else if (score>=60 && score<70){
        println("Student score is a C")
    }
    else{
        println("Student has failed")
    }








}