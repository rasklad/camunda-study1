package com.bpmn2.first.camunda

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication

@EnableProcessApplication
@SpringBootApplication
class Application

fun main(args: Array<String>) {
	println("Camunda Study 1 running...")
	runApplication<Application>(*args)
}
