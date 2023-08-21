//Parent class
 open class shape{
     open fun draw(){
         println("It is a shape")
     }
 }
//Child class
class rectangle:shape(){
    override fun draw() {
        println("Rectangle")
    }
}
class Square:shape(){
    override fun draw() {
        println("Square")
    }
}
fun main(){
    var r=rectangle()
    r.draw()

    var s=Square()
    s.draw()
}