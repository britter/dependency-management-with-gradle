plugins {
    `java-platform`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api("org.junit.jupiter:junit-jupiter-api:5.5.2")
    runtime("org.junit.jupiter:junit-jupiter-engine:5.5.2")
    api("org.assertj:assertj-core:3.11.1")

    constraints {
        api("io.mockk:mockk:1.9")
    }
}
