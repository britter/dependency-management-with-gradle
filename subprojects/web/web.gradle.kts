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

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.2")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:5.5.2")
    testImplementation("org.assertj:assertj-core:3.11.1")
    testImplementation("io.mockk:mockk:1.9")
}
