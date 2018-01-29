package factory

import shape.ShapeType

fun main(args : Array<String>) {
    val shapeFactory = ShapeFactory()

    val square = shapeFactory.getShape(ShapeType.SQUARE)
    square.draw()

    val rectangle = shapeFactory.getShape(ShapeType.RECTANGLE)
    rectangle.draw()

    val circle = shapeFactory.getShape(ShapeType.CIRCLE)
    circle.draw()
}