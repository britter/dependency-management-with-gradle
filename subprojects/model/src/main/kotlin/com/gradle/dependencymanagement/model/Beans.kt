package com.gradle.dependencymanagement.model

import com.google.common.base.CaseFormat
import com.google.common.base.Preconditions

data class Beans(
        val name: String,
        val roaster: String,
        val type: Type,
        val stars: Int
) {
    init {
        Preconditions.checkArgument(stars in 0..5, "Stars have to be between 0 and 5")
    }

    fun displayName(): String = "$name (${type.displayName()}) by $roaster"
}

enum class Type {
    ESPRESSO, FILTER;

    fun displayName(): String =
            CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name)
}
