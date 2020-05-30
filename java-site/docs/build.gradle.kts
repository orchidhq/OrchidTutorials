plugins {
    id("com.eden.orchidPlugin") version "0.21.0"
}

version = "1.0.0"

// 1. Include all official Orchid plugins and themes
dependencies {
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidDocs:0.21.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidJavadoc:0.21.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidPluginDocs:0.21.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidGithub:0.21.0")
}

// 2. Get Orchid from Jcenter
repositories {
    jcenter()
    maven(url = "https://kotlin.bintray.com/kotlinx/")
}

// 3. Use the "Editorial" theme, and view the site locally at "http://localhost:8080"
orchid {
    args = listOf("--experimentalSourceDoc")
}
