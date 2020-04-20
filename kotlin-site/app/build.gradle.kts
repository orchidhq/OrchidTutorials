plugins {
    kotlin("jvm") version "1.3.71"
    application
}
repositories {
    jcenter()
}
dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
application {
    mainClassName = "com.example.MainKt"
}
