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
        Main = "gg.emberfall.template.Main"
    }
}