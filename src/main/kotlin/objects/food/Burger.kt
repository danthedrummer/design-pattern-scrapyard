package objects.food

abstract class Burger : Item {

    override fun packing(): Packing {
        return Wrapper()
    }
}