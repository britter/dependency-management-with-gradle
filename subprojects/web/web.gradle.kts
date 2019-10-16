plugins {
    `kotlin-conventions`
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.1.9.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-mustache:2.1.9.RELEASE")

    api(project(":model"))
    api(project(":persistence"))
    implementation("com.google.guava:guava:28.1-jre")
}
