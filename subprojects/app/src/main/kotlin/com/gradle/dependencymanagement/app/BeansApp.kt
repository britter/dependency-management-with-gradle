package com.gradle.dependencymanagement.app

import com.gradle.dependencymanagement.web.BeansController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(
        "com.gradle.dependencymanagement.web",
        "com.gradle.dependencymanagement.persistence"
)
open class BeansApp

fun main(args: Array<String>) {
    runApplication<BeansApp>(*args)
}
