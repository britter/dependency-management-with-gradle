package com.gradle.dependencymanagement.persistence

import com.gradle.dependencymanagement.model.Beans
import org.springframework.stereotype.Component

@Component
internal class InMemoryBeansRepository : BeansRepository {
    private val store = mutableListOf<Beans>()

    override fun getAll(): List<Beans> {
        return store
    }

    override fun save(beans: Beans) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
