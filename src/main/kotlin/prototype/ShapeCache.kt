package prototype

import objects.shape.Circle
import objects.shape.Rectangle
import objects.shape.Shape
import objects.shape.Square

enum class ShapeCache {
    INSTANCE;

    private val shapeMap = mutableMapOf<String, Shape>()

    fun getShape(shapeId : String) : Shape? {
        val cachedShape = shapeMap[shapeId]
        if (cachedShape != null) {
            return cachedShape.clone() as Shape
        }
        return null
    }

    fun loadCache() {
        val circle = Circle("1")
        shapeMap.put(circle.id, circle)

        val square = Square("2")
        shapeMap.put(square.id, square)

        val rectangle = Rectangle("3")
        shapeMap.put(rectangle.id, rectangle)
    }

}