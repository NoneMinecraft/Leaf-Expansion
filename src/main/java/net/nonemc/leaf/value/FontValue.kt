package net.nonemc.leaf.value

import net.minecraft.client.gui.FontRenderer

abstract class FontValue(valueName: String, value: FontRenderer) : Value<FontRenderer>(valueName, value)