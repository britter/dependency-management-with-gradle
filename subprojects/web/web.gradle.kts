plugins {
    kotlin("jvm") version "1.3.50"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.springframework.boot:spring-boot-starter-web:2.1.9.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-mustache:2.1.9.RELEASE")

    api(project(":model"))
    api(project(":persistence"))
    implementation("com.google.guava:guava:28.1-jre")
}

tasks {
    compileKotlin {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }
}

