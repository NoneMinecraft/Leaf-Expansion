package net.nonemc.leaf.value

open class IntegerValue(
    name: String,
    value: Int,
    val minimum: Int = 0,
    val maximum: Int = Integer.MAX_VALUE,
    val suffix: String,
    displayable: () -> Boolean,
) : Value<Int>(name, value) {

    constructor(name: String, value: Int, minimum: Int, maximum: Int, displayable: () -> Boolean) : this(
        name,
        value,
        minimum,
        maximum,
        "",
        displayable
    )

    constructor(name: String, value: Int, minimum: Int, maximum: Int, suffix: String) : this(
        name,
        value,
        minimum,
        maximum,
        suffix,
        { true })

    constructor(name: String, value: Int, minimum: Int, maximum: Int) : this(name, value, minimum, maximum, { true })
}