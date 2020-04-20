plugins {
    kotlin("multiplatform") version "1.3.71"
    application
}
repositories {
    jcenter()
}

application {
    mainClassName = "com.example.MainKt"
}

kotlin {
    jvm {
        withJava()
    }
    js {
        nodejs()
    }
    macosX64("native") {
        binaries {
            executable {
                entryPoint = "com.example.main"
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
        val nativeMain by getting {
            dependencies {
            }
        }
    }
}


val run by tasks
val jsRun by tasks
val runDebugExecutableNative by tasks

run.dependsOn(jsRun)
run.dependsOn(runDebugExecutableNative)

