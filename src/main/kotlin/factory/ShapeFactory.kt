package factory

import objects.shape.*

class ShapeFactory {

    fun getShape(shapeType : ShapeType) : Shape {
        return when(shapeType) {
            ShapeType.SQUARE -> Square("1")
            ShapeType.RECTANGLE -> Rectangle("1")
            ShapeType.CIRCLE -> Circle("1")
        }
    }
}