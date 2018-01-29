package factory

import objects.shape.*

class ShapeFactory {

    fun getShape(shapeType : ShapeType) : Shape {
        return when(shapeType) {
            ShapeType.SQUARE -> Square()
            ShapeType.RECTANGLE -> Rectangle()
            ShapeType.CIRCLE -> Circle()
        }
    }
}