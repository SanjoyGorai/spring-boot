package org.example.bootapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BootappApplication

fun main(args: Array<String>) {
    runApplication<BootappApplication>(*args)
}
