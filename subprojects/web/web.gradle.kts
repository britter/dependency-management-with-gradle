plugins {
    kotlin("jvm") version "1.3.50"
}

repositories {
    jcenter()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))

    compile("org.springframework.boot:spring-boot-starter-web:2.1.9.RELEASE")
    compile("org.springframework.boot:spring-boot-starter-mustache:2.1.9.RELEASE")

    compile(project(":model"))
    compile(project(":persistence"))
}

tasks {
    compileKotlin {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }
}

