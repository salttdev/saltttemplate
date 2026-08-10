plugins {
    java
    id("com.gradleup.shadow") version "8.3.0"
}

val javaVersion = 25

repositories {
    // Any external repositories besides: MavenLocal, MavenCentral, HytaleMaven, and CurseMaven
}

dependencies {
    //compileOnly(libs.jetbrains.annotations)
    //compileOnly(libs.jspecify)

    compileOnly(fileTree("libs") {
        include("*.jar")
    })
}

tasks.shadowJar {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

    dependencies {
        exclude(dependency("com.hypixel.hytale:Server:.*"))
        exclude(dependency("dev.scaffoldit:.*:.*"))
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(javaVersion)
    }
    withSourcesJar()
}