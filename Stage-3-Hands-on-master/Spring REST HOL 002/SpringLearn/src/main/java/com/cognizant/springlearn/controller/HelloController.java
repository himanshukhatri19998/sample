package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	// Include the Sample Response
	@GetMapping("/hello")
	public String sayHello() {
		LOGGER.info("Start: HelloController: sayHello()");
		LOGGER.info("Stop: HelloController: sayHello()");
		return "Hello World!!";
	}

}
