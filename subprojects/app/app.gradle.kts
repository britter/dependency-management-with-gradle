plugins {
    `kotlin-conventions`
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.1.9.RELEASE"))
    implementation("org.springframework.boot:spring-boot-starter")

    implementation(project(":web"))
}
