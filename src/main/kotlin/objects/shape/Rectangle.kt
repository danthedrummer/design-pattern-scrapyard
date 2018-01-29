package objects.shape

class Rectangle(override var id: String) : Shape() {

    override val type: String = "Rectangle"

    override fun draw() {
        println("Drawing $type $id")
    }
}