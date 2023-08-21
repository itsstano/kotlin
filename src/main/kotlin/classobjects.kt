class person{
    //Attributes/property/Variable
    var name="Stanley"
    var skintone="Lightskin"
    var age=18

    //Method/Function
    fun eat(){
        println("Eating")
    }
    fun walk(){
        println("Walking")
    }

}
fun main(){
    var teacher=person()
    println(teacher.age)
    teacher.walk()

    //Object2
    var accountant=person()
    println(accountant.name)

    accountant.eat()

}
