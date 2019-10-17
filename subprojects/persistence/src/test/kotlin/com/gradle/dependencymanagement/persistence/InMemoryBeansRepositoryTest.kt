package com.gradle.dependencymanagement.persistence

import com.gradle.dependencymanagement.model.BeansTemplates
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class InMemoryBeansRepositoryTest {

    private lateinit var repository: InMemoryBeansRepository

    @BeforeEach
    internal fun setUp() {
        repository = InMemoryBeansRepository()
    }

    @Test
    internal fun `repository is empty initially`() {
        assertThat(repository.getAll()).isEmpty()
    }

    @Test
    internal fun `should save beans`() {
        repository.save(BeansTemplates.espresso)
        repository.save(BeansTemplates.filter)

        assertThat(repository.getAll()).contains(BeansTemplates.espresso, BeansTemplates.filter)
    }
}
