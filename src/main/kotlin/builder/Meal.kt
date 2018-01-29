package builder

import objects.food.Item

class Meal {

    private val items = mutableListOf<Item>()

    fun addItem(item : Item) {
        items.add(item)
    }

    fun getCost() : Float {
        var cost = 0.0f
        items.forEach { item ->
            cost += item.price()
        }
        return cost
    }

    fun showItems() {
        items.forEach { item ->
            println("Item\t${item.name()}, ${item.packing().pack()}, ${item.price()}")
        }
    }
}