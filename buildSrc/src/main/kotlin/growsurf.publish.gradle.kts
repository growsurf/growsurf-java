plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("GrowSurf REST API")
                description.set("Public GrowSurf REST API for managing programs, participants, referrals,\nrewards, affiliate commissions, payouts, and analytics.\n\nAll endpoints require an API key in the `Authorization: Bearer <api_key>`\nheader.")
                url.set("https://growsurf.com/settings#contact_support")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Growsurf")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/growsurf/growsurf-java.git")
                    developerConnection.set("scm:git:git://github.com/growsurf/growsurf-java.git")
                    url.set("https://github.com/growsurf/growsurf-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
    repositories {
        if (project.hasProperty("publishLocal")) {
            maven {
                name = "LocalFileSystem"
                url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
