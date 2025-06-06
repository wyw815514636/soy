plugins {
    java
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
    implementation("io.smallrye.reactive:mutiny")
    implementation("io.quarkus:quarkus-rest-jackson")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("jakarta.persistence:jakarta.persistence-api")
    implementation("jakarta.interceptor:jakarta.interceptor-api")
}