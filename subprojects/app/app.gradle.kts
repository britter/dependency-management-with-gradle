plugins {
    `kotlin-conventions`
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:2.1.9.RELEASE")
    implementation(project(":web"))
}
