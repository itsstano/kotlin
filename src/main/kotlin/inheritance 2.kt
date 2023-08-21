open class employee{
    fun name(){
        println("Employee's are working")
    }
    fun age(){
        println(41)
    }
    fun salary(){
        println(560000)
    }
}
class webDeveloper:employee(){
    fun website(){
        println("Procurement")
    }
}
class AndroidDeveloper:employee(){
    fun android(){
        println("Android")
    }
}
class IosDeveloper:employee(){
    fun ios(){
        println("Ios")
    }
}
fun main(){
    var w=webDeveloper()
    w.salary()

    var a=AndroidDeveloper()
    a.salary()
}

