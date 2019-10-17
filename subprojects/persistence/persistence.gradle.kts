plugins {
    `kotlin-conventions`
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.1.9.RELEASE"))
    implementation("org.springframework:spring-context")

    api(project(":model"))

    testImplementation(platform(project(":test-platform")))
}
