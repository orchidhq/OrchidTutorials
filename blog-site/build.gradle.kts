plugins {
    id("com.eden.orchidPlugin") version "0.21.0"
}

version = "1.0.0"

// 1. Include all the common plugins for blogging, and a theme
dependencies {
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidBlog:0.21.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidFutureImperfect:0.21.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidSearch:0.21.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidPluginDocs:0.21.0")
}

// 2. Get Orchid from Jcenter
repositories {
    jcenter()
}
