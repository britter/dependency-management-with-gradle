plugins {
    `kotlin-conventions`
}

dependencies {
    api(project(":model"))
    implementation("org.springframework:spring-context:5.1.0.RELEASE")
}
