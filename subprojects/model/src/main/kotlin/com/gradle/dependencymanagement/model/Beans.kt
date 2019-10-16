package com.gradle.dependencymanagement.model

data class Beans(
        val name: String,
        val roaster: String,
        val type: Type,
        val stars: Int
)

enum class Type {
    ESPRESSO, FILTER
}
