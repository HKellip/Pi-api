package com.app.pi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PiApplication

fun main(args: Array<String>) {
	runApplication<PiApplication>(*args)
}
