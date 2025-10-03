package dev.me.leaf.module

import net.nonemc.leaf.libs.log.normalLog
import net.nonemc.leaf.module.Module
import net.nonemc.leaf.module.ModuleCategory
import net.nonemc.leaf.module.ModuleInfo

@ModuleInfo(name = "ExampleModule", category = ModuleCategory.COMBAT)
class ExampleModule : Module() {
    override fun onEnable() {
        normalLog("HelloWorld")
    }
}