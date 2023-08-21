import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter temperature:")
    var temperature=reader.nextInt()

    if (temperature>37){
        println("It is too hot")
    }
    else {
        println("It is too cold")
    }



}