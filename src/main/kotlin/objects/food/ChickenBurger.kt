package objects.food

class ChickenBurger : Burger() {

    override fun name(): String {
        return "Chicken Burger"
    }

    override fun price(): Float {
        return 30.0f
    }
}