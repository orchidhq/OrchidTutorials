package com.example

/**
 * Run the ExampleApplication
 */
fun main() {
    ExampleApplication().run {
        println("Running $name version $version...")
        start("3")
        println("Finished!")
    }
}

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

class ExampleApplication : Application {
    override val version: String = "1.0.0"
    override val name: String = "Example Application"

    override fun start(vararg args: String) {
        for(i in 1..args.first().toInt()) {
            println("$i...")
            Thread.sleep(1000)
        }
    }
}