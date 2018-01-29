package objects.shape

abstract class Shape : Cloneable {

    abstract var id : String
    abstract val type : String

    abstract fun draw()

    override public fun clone(): Any {
        return try {
            super.clone()
        } catch (e : CloneNotSupportedException) {
            e.printStackTrace()
        }
    }
}