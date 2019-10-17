package com.gradle.dependencymanagement.web

import com.gradle.dependencymanagement.persistence.BeansRepository
import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.ui.ConcurrentModel
import org.springframework.ui.ModelMap
import java.lang.NullPointerException

class BeansControllerTest {

    private lateinit var controller: BeansController
    private lateinit var repository: BeansRepository

    @BeforeEach
    internal fun setUp() {
        repository = mockk<BeansRepository>()
        controller = BeansController(repository)
    }

    @Test
    internal fun `should present beans`() {
        val allBeans = listOf(BeansTemplates.espresso, BeansTemplates.filter)
        every { repository.getAll() }.returns(allBeans)
        val model = ConcurrentModel()

        controller.home(model)

        assertThat(model["beans"]).isEqualTo(allBeans)
    }
}
