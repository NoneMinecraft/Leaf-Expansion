package net.nonemc.leaf.value

abstract class Value<T>(val name: String, var value: T) {
    val default = value
    var displayableFunc: () -> Boolean = { true }
    val displayable get() = displayableFunc()
    fun displayable(func: () -> Boolean) = apply { displayableFunc = func }
    fun set(newValue: T) {}
    fun setDefault() {}
    fun get() = value
}