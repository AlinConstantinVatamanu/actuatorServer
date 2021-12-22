package com.nttdata.actuatorserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro1")
public class TestController {

//	private Counter counter;
//	
//	public TestController(MeterRegistry registry) {
//		this.counter = Counter.builder("invocaciones.hellp").description("Invocaciones totales").register(registry);
//	}
	
	@GetMapping(path="/helloWorld1")
	public String hellpWorld() {
		//counter.increment();
		return "Hello World micro1";
	}
	
}
