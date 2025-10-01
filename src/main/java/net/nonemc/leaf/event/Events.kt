package net.nonemc.leaf.event

import net.minecraft.client.gui.GuiScreen
import net.minecraft.client.gui.ScaledResolution
import net.minecraft.entity.Entity
import net.minecraft.network.Packet

class AttackEvent(val targetEntity: Entity) : CancelableEvent()

class KeyEvent(val key: Int) : Event()

class MotionEvent(
    var x: Double,
    var y: Double,
    var z: Double,
    var yaw: Float,
    var pitch: Float,
    var onGround: Boolean
) : Event()

class SlowDownEvent(var strafe: Float, var forward: Float) : Event()

class StrafeEvent(val strafe: Float, val forward: Float, val friction: Float) : CancelableEvent()

class PacketEvent(val packet: Packet<*>, val type: Type) : CancelableEvent() {
    enum class Type {
        RECEIVE,
        SEND
    }

    fun isServerSide() = type == Type.RECEIVE
}

class Render2DEvent(val partialTicks: Float, val scaledResolution: ScaledResolution) : Event()

class Render3DEvent(val partialTicks: Float) : Event()

class ScreenEvent(val guiScreen: GuiScreen?) : Event()

class TextEvent(var text: String?) : Event()

class TickEvent : Event()

enum class EventStage {
    PRE, POST
}

class UpdateEvent(val stage: EventStage) : Event()

class CoverageUpdateEvent(val stage: EventStage) : Event()