plugins {
    id("com.eden.orchidPlugin") version "0.20.0"
}

// 1. Include all official Orchid plugins and themes
dependencies {
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidCore:0.20.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidBsDoc:0.20.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidPages:0.20.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidAsciidoc:0.20.0")
}

// 2. Get Orchid from Jcenter
repositories {
    jcenter()
}

// 3. Use the "BsDoc" theme, and view the site locally at "http://localhost:8080"
orchid {
    theme = "BsDoc"
    baseUrl = "http://localhost:8080"
}
