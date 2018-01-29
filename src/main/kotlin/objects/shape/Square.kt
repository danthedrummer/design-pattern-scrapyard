package objects.shape

class Square(override var id: String) : Shape() {

    override val type: String = "Square"

    override fun draw() {
        println("Drawing $type $id")
    }
}