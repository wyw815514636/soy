plugins {
    kotlin("jvm") version "2.1.20"
}

group = "org.acme"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation("jakarta.persistence:jakarta.persistence-api")
    implementation("io.quarkus:quarkus-hibernate-reactive-panache-kotlin")
}