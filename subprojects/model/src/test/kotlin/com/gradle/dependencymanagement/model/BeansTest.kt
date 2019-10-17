package com.gradle.dependencymanagement.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

class BeansTest {

    @Test
    internal fun `should not create beans with less than 0 stars`() {
        assertThrows<IllegalArgumentException> {
            Beans("name", "roaster", Type.FILTER, -1)
        }
    }

    @Test
    internal fun `should not create beans with more than 5 stars`() {
        assertThrows<IllegalArgumentException> {
            Beans("name", "roaster", Type.FILTER, 6)
        }
    }

    @Test
    internal fun `should format display name`() {
        assertThat(BeansTemplates.espresso.displayName()).isEqualTo("Strong and Black (Espresso) by Espresso Brothers")
    }
}
