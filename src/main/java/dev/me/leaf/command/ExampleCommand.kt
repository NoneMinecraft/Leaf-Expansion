package dev.me.leaf.command

import net.nonemc.leaf.command.ICommand
import net.nonemc.leaf.libs.log.normalLog

class ExampleCommand : ICommand {
    override fun name() = "example"

    override fun aliases() = listOf("ex")

    override fun complete(args: List<String>): List<String> {
        return when (args.size) {
            else -> emptyList()
        }
    }

    override fun execute(args: List<String>) {
        normalLog("Example command execution.")
    }
}
