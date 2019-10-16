package com.gradle.dependencymanagement.persistence

import com.gradle.dependencymanagement.model.Beans
import com.gradle.dependencymanagement.model.Type
import org.springframework.stereotype.Component

@Component
internal class InMemoryBeansRepository : BeansRepository {

    private val store = mutableListOf<Beans>(
            Beans("GEISHA CASCARA", "The Barn", Type.FILTER, 4),
            Beans("Worka", "Machhörndl", Type.FILTER, 5)
    )

    override fun getAll(): List<Beans> {
        return store
    }

}
