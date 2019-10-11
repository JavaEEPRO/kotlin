package main.kotlin.si.inspirited

import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class AppUp

    fun main(args: Array<String>) {
        runApplication<AppUp>(*args)
    }
