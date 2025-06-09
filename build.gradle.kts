plugins {
    application
}

application {
    mainClass = "io.hexlet.challenges.App"
}

group = "io.hexlet.challenges"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)
}

tasks.test {
    useJUnitPlatform()
}