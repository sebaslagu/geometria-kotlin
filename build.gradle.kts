plugins {
    kotlin("jvm") version "1.9.23"
}
group = "com.geometria"
version = "1.0.0"
repositories { mavenCentral() }
dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}
kotlin { jvmToolchain(21) }
tasks.test { useJUnitPlatform() }
