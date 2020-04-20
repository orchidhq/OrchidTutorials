package com.example

import platform.posix.usleep

actual object PlatformApplication : Application {
    override val version: String = "1.0.0"
    override val name: String = "Example Kotlin MPP Application (Native)"

    override fun start(vararg args: String) {
        for(i in 1..args.first().toInt()) {
            println("$i...")
            usleep(1000.toUInt())
        }
    }
}
