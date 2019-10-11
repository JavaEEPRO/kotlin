package main.kotlin.si.inspirited.web.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class KotlinController {

    @GetMapping("/")
    fun blog(model:Model): String {
        model["title"] = "Blog"
        return "blog"
    }
}