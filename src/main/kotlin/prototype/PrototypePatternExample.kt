package prototype

import objects.shape.Shape

fun main(args : Array<String>) {
    ShapeCache.INSTANCE.loadCache()

    val clonedShape1 = ShapeCache.INSTANCE.getShape("1") as Shape
    println("Shape: ${clonedShape1.type}")

    val clonedShape2 = ShapeCache.INSTANCE.getShape("2") as Shape
    println("Shape: ${clonedShape2.type}")

    val clonedShape3 = ShapeCache.INSTANCE.getShape("3") as Shape
    println("Shape: ${clonedShape3.type}")
}