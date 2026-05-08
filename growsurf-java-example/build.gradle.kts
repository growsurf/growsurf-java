plugins {
    id("growsurf.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":growsurf-java-core"))
    implementation(project(":growsurf-java-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :growsurf-java-example:run` to run `Main`
    // Use `./gradlew :growsurf-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.growsurf.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
