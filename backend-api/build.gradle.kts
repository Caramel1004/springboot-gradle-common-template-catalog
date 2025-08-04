val group = "com.common.template"
val version = libs.versions.project.get()

plugins {
    alias(libs.plugins.springframework.boot)
    alias(libs.plugins.spring.dependency.management)
    application
    distribution
}

tasks.bootJar {
    enabled = true
    mainClass = "${group}.Launcher"
    archiveFileName = "template.jar"
}

application {
    mainClass = "${group}.Launcher"
}

distributions {
    version
}

java { toolchain { JavaLanguageVersion.of(21) } }

repositories { mavenCentral() }

dependencies {
    implementation(libs.spring.boot.starter.web)
    implementation(libs.spring.context)
    implementation(libs.spring.processor)
    implementation(libs.jakarta.annotation)

    testRuntimeOnly(libs.h2)
    testImplementation(libs.junit.jupiter.api)
    testImplementation(libs.junit)
    testImplementation(libs.mockito)
}

tasks.withType<Test> { useJUnitPlatform() }