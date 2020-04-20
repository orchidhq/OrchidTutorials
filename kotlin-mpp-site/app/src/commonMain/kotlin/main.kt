package com.example

/**
 * An Application that can be run with arbitrary arguments.
 */
interface Application {

    /**
     * The name of the application
     */
    val name: String

    /**
     * The current application version
     */
    val version: String

    /**
     * Run this application with the arguments provided
     *
     * @param args the args to configure the application
     */
    fun start(vararg args: String)
}

expect object PlatformApplication : Application

/**
 * Run the ExampleApplication
 */
fun main() {
    PlatformApplication.run {
        println("Running ${PlatformApplication.name} version ${PlatformApplication.version}...")
        PlatformApplication.start("3")
        println("Finished!")
    }
}
