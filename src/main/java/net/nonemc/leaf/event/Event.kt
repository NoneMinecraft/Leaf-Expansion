package net.nonemc.leaf.event

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.RUNTIME)
annotation class EventTarget

open class Event

open class CancelableEvent : Event() {
    fun cancelEvent() {}
}

interface Listenable