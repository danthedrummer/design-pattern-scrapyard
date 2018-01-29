package singleton

enum class SingleObject {
    INSTANCE;

    fun showMessage() {
        println("Single Object")
    }
}