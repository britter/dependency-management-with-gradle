package com.gradle.dependencymanagement.web

import com.gradle.dependencymanagement.persistence.BeansRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class BeansController constructor(private val repository: BeansRepository) {

    @GetMapping
    fun home(model: Model): String {
        model.addAttribute("beans", repository.getAll())
        return "home"
    }

}
