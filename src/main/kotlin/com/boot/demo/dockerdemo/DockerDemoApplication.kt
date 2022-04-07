package com.boot.demo.dockerdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DockerDemoApplication

fun main(args: Array<String>) {
	runApplication<DockerDemoApplication>(*args)
}

@RestController
@RequestMapping("/hello")
class HelloController{

	@GetMapping
	fun hello(): String = "Hi ! I get autodeployed in AWS ECS!"

}
