plugins {
    `kotlin-conventions`
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.1.9.RELEASE"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-mustache")

    api(project(":model"))
    api(project(":persistence"))
    implementation("com.google.guava:guava:28.1-jre")

    testImplementation(platform(project(":test-platform")))
    testImplementation("io.mockk:mockk")
}
