package objects.food

abstract class ColdDrink : Item {

    override fun packing(): Packing {
        return Bottle()
    }
}