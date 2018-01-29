package builder

fun main(args : Array<String>) {

    val mealBuilder = MealBuilder()

    val vegMeal = mealBuilder.prepareVegMeal()
    println("Veg meal")
    vegMeal.showItems()
    println("Total\t${vegMeal.getCost()}\n")

    val nonVegMeal = mealBuilder.prepareNonVegMeal()
    println("Non veg meal")
    nonVegMeal.showItems()
    println("Total\t${nonVegMeal.getCost()}\n")
}