/*class Dog(var color:String,var breed:String)

fun main(){
    var c=Dog("White","Chiwawa")
    println(c.breed)

    var d=Dog("Brown","Siberian Husky")
    println(d.color)
}*/

//class employess using constructors have manager watchman
class Employee(var JobDescription:String, var salary:Double,var age:Int, var YearsOfExperience:Int)

fun main(){
    var a=Employee("Manager",100000.00,40,10)
    println(a.JobDescription)

    var b=Employee("Watchman",35000.00,26,5)
    println(b.salary)

}

