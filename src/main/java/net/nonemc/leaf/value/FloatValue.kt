package net.nonemc.leaf.value

open class FloatValue(name: String, value: Float, val minimum: Float = 0F, val maximum: Float = Float.MAX_VALUE) : Value<Float>(name, value)