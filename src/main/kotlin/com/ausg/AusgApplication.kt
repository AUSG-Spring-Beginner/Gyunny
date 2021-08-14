package com.ausg

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AusgApplication

fun main(args: Array<String>) {
    runApplication<AusgApplication>(*args)
}
