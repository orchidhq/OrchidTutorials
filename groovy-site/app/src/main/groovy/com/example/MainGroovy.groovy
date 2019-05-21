package com.example

class MainGroovy {
    static void main(String... args) {
        def app = new ExampleApplication()

        println("Running $app.name version $app.version...")
        app.start("3")
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
    String getName()

    /**
     * The current application version
     */
    String getVersion()

    /**
     * Run this application with the arguments provided
     *
     * @param args the args to configure the application
     */
    void start(String... args)
}

class ExampleApplication implements Application {
    @Override
    String getName() {
        return "Example Groovy Application"
    }

    @Override
    String getVersion() {
        return "1.0.0"
    }

    @Override
    void start(String... args) {
        def iterations = Integer.parseInt(args[0])

        for (int i = 1; i <= iterations; i++) {
            println(i + "...")
            try {
                Thread.sleep(1000)
            }
            catch (Exception e) {
                e.printStackTrace()
            }
        }
    }
}
