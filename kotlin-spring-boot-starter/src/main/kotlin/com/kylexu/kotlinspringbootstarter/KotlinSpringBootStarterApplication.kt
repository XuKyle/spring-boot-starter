package com.kylexu.kotlinspringbootstarter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBootStarterApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringBootStarterApplication>(*args)
}
