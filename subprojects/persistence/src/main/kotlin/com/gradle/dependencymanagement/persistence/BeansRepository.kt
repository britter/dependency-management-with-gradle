package com.gradle.dependencymanagement.persistence

import com.gradle.dependencymanagement.model.Beans

interface BeansRepository {

    fun getAll(): List<Beans>

    fun save(beans: Beans)
}
