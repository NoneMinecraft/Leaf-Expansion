package net.nonemc.leaf.module

import net.nonemc.leaf.event.Listenable
import net.nonemc.leaf.libs.base.MinecraftInstance
import org.lwjgl.input.Keyboard

open class Module : MinecraftInstance(), Listenable {
    var name: String
    var category: ModuleCategory
    var canEnable: Boolean
    val info = javaClass.getAnnotation(ModuleInfo::class.java)!!
    var keyBind = Keyboard.CHAR_NONE
    var state = false

    init {
        name = info.name
        category = info.category
        keyBind = info.keyBind
        canEnable = info.canEnable
    }

    open fun onEnable() {}
    open fun onDisable() {}
}


enum class ModuleCategory(val categoryName: String) {
    COMBAT("Combat"),
    PLAYER("Player"),
    MOVEMENT("Movement"),
    RENDER("Render"),
    CLIENT("Client"),
    RAGE("Rage"),
    DEBUG("Debug"),
}

@Retention(AnnotationRetention.RUNTIME)
annotation class ModuleInfo(
    val name: String,
    val category: ModuleCategory,
    val keyBind: Int = Keyboard.CHAR_NONE,
    val canEnable: Boolean = true,
    val on: Boolean = false,
)