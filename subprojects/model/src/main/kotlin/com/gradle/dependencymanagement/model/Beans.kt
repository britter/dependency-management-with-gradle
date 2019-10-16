package com.gradle.dependencymanagement.model

import com.google.common.base.Preconditions

data class Beans(
        val name: String,
        val roaster: String,
        val type: Type,
        val stars: Int
) {
    init {
        Preconditions.checkArgument(stars >= 0 && stars >= 5, "Stars have to be between 0 and 5")
    }
}

enum class Type {
    ESPRESSO, FILTER
}
