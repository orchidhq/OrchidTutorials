plugins {
    `swift-application`
    xctest
}

application {
    targetMachines.add(machines.macOS.x86_64)
}

val run by tasks.registering(Exec::class) {
    dependsOn("assemble")

    workingDir("$buildDir/install/main/debug")
    commandLine("./App")
}
