import dev.scaffoldit.hytale.wire.HytaleManifest

rootProject.name = "template"

plugins {
    // See documentation on https://scaffoldit.dev
    id("dev.scaffoldit") version "0.2.+"
}

hytale {
    usePatchline("release")
    useVersion("latest")

    repositories {
        maven("https://jitpack.io")
    }

    dependencies {
        // Any external dependency you also want to include
        implementation("org.mariadb.jdbc:mariadb-java-client:3.5.3")
        implementation("com.zaxxer:HikariCP:6.3.0")
    }

    manifest {
        Group = "Saltt"
        Name = "template"
        Version = "1.0.0"
        Description = "A Hytale server mod"
        Main = "dev.saltt.template.Main"
    }
}