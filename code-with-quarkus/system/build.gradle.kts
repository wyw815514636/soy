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
    implementation(project(":share"))
    implementation(project(":domain"))
    implementation("io.smallrye.reactive:mutiny")
    implementation("io.quarkus:quarkus-arc")
    implementation("io.quarkus:quarkus-rest")
    implementation("io.quarkus:quarkus-messaging-kafka")
    implementation("io.quarkus:quarkus-opentelemetry")
    implementation("io.quarkus:quarkus-hibernate-reactive-panache-kotlin")
    implementation("io.quarkus:quarkus-mongodb-panache-kotlin")
    implementation("io.quarkus:quarkus-smallrye-jwt")
    implementation("io.quarkus:quarkus-smallrye-jwt-build")
}