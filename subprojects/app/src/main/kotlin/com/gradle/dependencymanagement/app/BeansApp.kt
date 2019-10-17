package com.gradle.dependencymanagement.app

import com.gradle.dependencymanagement.model.Beans
import com.gradle.dependencymanagement.model.Type
import com.gradle.dependencymanagement.persistence.BeansRepository
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
    val ctx = runApplication<BeansApp>(*args)
    val repository = ctx.getBean(BeansRepository::class.java)

    repository.save(Beans("GEISHA CASCARA", "The Barn", Type.FILTER, 4))
    repository.save(Beans("Worka", "Machhörndl", Type.FILTER, 5))
}
