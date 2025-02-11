package com.mnp.designpatterns.dependency_injection

class Car(private val engine: Engine) {
    fun start() {
        engine.start()
    }
}

data class Engine(val name: String = "V8") {
    fun start() {
        println("Engine started: $name")
    }
}

fun main(args: Array<String>) {
    val engine = Engine()
    val car = Car(engine)
    car.start()
}