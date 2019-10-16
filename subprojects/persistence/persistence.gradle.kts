plugins {
    kotlin("jvm") version "1.3.50"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    api(project(":model"))
    implementation("org.springframework:spring-context:5.1.0.RELEASE")
}
