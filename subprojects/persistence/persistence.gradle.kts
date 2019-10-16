plugins {
    kotlin("jvm") version "1.3.50"
}

repositories {
    jcenter()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))

    compile(project(":model"))
    compile("org.springframework:spring-context:5.1.0.RELEASE")
}
