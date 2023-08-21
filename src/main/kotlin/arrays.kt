fun main(){
    var language= arrayOf("Kotlin","Java","PHP")

    //Accessing an element

    //Reassigning a value
    language[1]="Python"
    for (x in language){
        println(x)
    }
    //Size of the array
    println(language.size)

    //Adding values to an array
    var new=language.plus("C++")
    for (b in new){
        println(b)
    }
}