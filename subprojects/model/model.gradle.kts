plugins {
    `kotlin-conventions`
}

dependencies {
    implementation("com.google.guava:guava:28.1-jre")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.2")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:5.5.2")
    testImplementation("org.assertj:assertj-core:3.11.1")
}
