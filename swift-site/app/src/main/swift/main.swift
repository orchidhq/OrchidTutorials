import Darwin

/**
 An Application that can be run with arbitrary arguments.
 */
protocol Application {
    /**
     The name of the application
     */
    var name: String { get }

    /**
     The current application version
     */
    var version: String { get }

    /**
    Run this application with the arguments provided
    
    - Parameters:
        - args: the args to configure the application
     */
    func start(_ args: String...)
}

class ExampleApplication : Application {
    var version: String = "1.0.0"
    var name: String = "Example Swift Application"

    func start(_ args: String...) {
        let iterations = Int(args[0]) ?? 0

        for i in 1...iterations {
            print("\(i)...")
            sleep(1)
        }
    }
}

let app = ExampleApplication()
print("Running \(app.name) version \(app.version)...")
app.start("3")
print("Finished!")