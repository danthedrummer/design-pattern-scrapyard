package objects.food

interface Item {
    fun name() : String
    fun packing() : Packing
    fun price() : Float
}