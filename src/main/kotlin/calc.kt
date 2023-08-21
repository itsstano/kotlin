import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter the first number:")
    var fnumber=reader.nextInt()

    println("Enter the operator(+,-,/,*):")
    var operator= readLine()

    println("Enter the second number:")
    var lnumber=reader.nextInt()

    if (fnumber==null||operator==null||lnumber==null ) {
        println("Inavalid input please put a correct operator")
        return
    }
    val results=when(operator){
        "+"-> fnumber+lnumber
        "-"-> fnumber-lnumber
        "*"-> fnumber*lnumber
        "/"-> fnumber/lnumber

        else->"Invalid Operator"
    }
    println("Answer=$results")


}