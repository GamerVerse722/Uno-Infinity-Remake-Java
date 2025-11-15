plugins {
    java
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("tools.jackson.core:jackson-databind:3.0.0")
    implementation("tools.jackson.core:jackson-core:3.0.0")

    implementation("org.jetbrains:annotations:26.0.2-1")
    implementation("io.github.classgraph:classgraph:4.8.184")
}

tasks.processResources {
    filesMatching("META-INF/mods.toml") {
        expand(project.properties)
    }
}
