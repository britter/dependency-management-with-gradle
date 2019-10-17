package com.gradle.dependencymanagement.persistence

import com.gradle.dependencymanagement.model.Beans
import com.gradle.dependencymanagement.model.Type

object BeansTemplates {

    val espresso = Beans("Strong and Black", "Espresso Brothers", Type.ESPRESSO, 3)

    val filter = Beans("Smooth and energizing", "The Coffee Mill", Type.FILTER, 3)
}
