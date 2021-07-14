plugins {
    kotlin("multiplatform")
    id("kotlinx-serialization")
}

kotlin {
    jvm {
        withJava()
    }
    js(IR) {
        browser()
        binaries.executable()
    }

    sourceSets {
        sourceSets["commonMain"].dependencies {
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0-native-mt")
            implementation("io.ktor:ktor-client-core:1.6.1")
            implementation("io.ktor:ktor-client-json:1.6.1")
            implementation("io.ktor:ktor-client-logging:1.6.1")
            implementation("io.ktor:ktor-client-serialization:1.6.1")
            implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.2.1")
        }
    }
}