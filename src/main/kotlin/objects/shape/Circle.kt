package objects.shape

class Circle(override var id : String) : Shape() {

    override val type: String = "Circle"


    override fun draw() {
        println("Drawing $type $id")
    }
}