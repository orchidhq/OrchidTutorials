plugins {
    groovy
    application
}
repositories {
    jcenter()
}
dependencies {
    implementation("org.codehaus.groovy:groovy-all:2.4.5")
}
application {
    mainClassName = "com.example.MainGroovy"
}
