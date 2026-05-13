import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

publishing {
  repositories {
      if (project.hasProperty("publishLocal")) {
          maven {
              name = "LocalFileSystem"
              url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
          }
      }
  }
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    if (!project.hasProperty("publishLocal")) {
        signAllPublications()
        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    }

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

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
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
