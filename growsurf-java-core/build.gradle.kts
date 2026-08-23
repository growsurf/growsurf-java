plugins {
    id("growsurf.kotlin")
    id("growsurf.publish")
}

configurations.all {
    resolutionStrategy {
        // Compile and test against the lowest Jackson version the README advertises, so a change that
        // reaches for a newer Jackson API fails here instead of at a consumer whose framework pins
        // Jackson (a Spring Boot BOM does exactly that). We publish the higher version below, so
        // consumers who do not pin still get a secure Jackson by default. `resolutionStrategy` only
        // affects resolution inside this build; the published POM keeps the declared versions.
        force("com.fasterxml.jackson.core:jackson-core:2.14.0")
        force("com.fasterxml.jackson.core:jackson-databind:2.14.0")
        force("com.fasterxml.jackson.core:jackson-annotations:2.14.0")
        force("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.14.0")
        force("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.0")
        force("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.0")
    }
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-core:2.18.9")
    api("com.fasterxml.jackson.core:jackson-databind:2.18.9")
    api("com.google.errorprone:error_prone_annotations:2.50.0")

    implementation("com.fasterxml.jackson.core:jackson-annotations:2.18.9")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.18.9")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.9")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.9")

    testImplementation(kotlin("test"))
    testImplementation(project(":growsurf-java-client-okhttp"))
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.35.2")
    testImplementation("org.assertj:assertj-core:3.27.7")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.3")
    testImplementation("org.junit-pioneer:junit-pioneer:1.9.1")
    testImplementation("org.mockito:mockito-core:5.14.2")
    testImplementation("org.mockito:mockito-junit-jupiter:5.14.2")
    testImplementation("org.mockito.kotlin:mockito-kotlin:4.1.0")
}
