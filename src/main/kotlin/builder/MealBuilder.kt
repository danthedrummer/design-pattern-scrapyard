package builder

import objects.food.ChickenBurger
import objects.food.Coke
import objects.food.Pepsi
import objects.food.VegBurger

class MealBuilder {

    fun prepareVegMeal() : Meal {
        val meal = Meal()
        meal.addItem(VegBurger())
        meal.addItem(Coke())
        return meal
    }

    fun prepareNonVegMeal() : Meal {
        val meal = Meal()
        meal.addItem(ChickenBurger())
        meal.addItem(Pepsi())
        return meal
    }
}