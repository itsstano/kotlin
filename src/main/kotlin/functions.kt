fun main(){
    println("Hello Kotlin")

    var squareroot=Math.sqrt(81.0)
    println(squareroot)

    var number=Math.round(34.87)
    println(number)

    var num=Math.ceil(45.2)
    println(num)
    sum()
    product(45, 54)
    divide(50,3)
    details("Stanley",19)
}
    //User defined function
fun sum(){
    var num1=3
    var num2=4
    println(num1+num2)

}
    //Parameterized functions
fun product(x:Int,y:Int){
    println(x*y)
}
fun divide(x:Int,y: Int){
    println(x/y)
}
fun details(name:String,age:Int){
    println("My name is $name.I am $age years old")
}