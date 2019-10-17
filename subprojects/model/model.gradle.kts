plugins {
    `kotlin-conventions`
    `java-test-fixtures`
}

dependencies {
    implementation("com.google.guava:guava:28.1-jre")

    testImplementation(platform(project(":test-platform")))
}
