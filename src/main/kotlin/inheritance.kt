//Parent class/Super class/Base class
 open class Animal1{
    var color="Brown"

    fun eat(){
        println("Animal is eating")
    }
}
//Child class/Sub class/Derived class
class Dog:Animal1(){
    var name="Siberian Husky"
    fun sound(){
        println("Dog is barking")
    }
}
class Cat: Animal1() {
    var hasFur=true
    fun meow(){
        println("Meowing")
    }
}
fun main(){
    var a=Animal1()
    println(a.color)

    var d=Dog()
    d.eat()

    var c=Cat()
    c.meow()
    println(c.hasFur)

}