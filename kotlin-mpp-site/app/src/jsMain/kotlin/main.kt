package com.example

actual object PlatformApplication : Application {
    override val version: String = "1.0.0"
    override val name: String = "Example Kotlin MPP Application (NodeJs)"

    override fun start(vararg args: String) {
        for(i in 1..args.first().toInt()) {
            println("$i...")
        }
    }
}
