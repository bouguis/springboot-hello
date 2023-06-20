package com.javaexpress.docker.dockerspringboothello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/docker")
public class DockerHelloWorld {

	@GetMapping
	public String getName() {
		
		return "Welcome to deployment in docker testing";
	}

	@GetMapping("/")
	public String getState() {

		return "Welcome to deployment automatic pushing in aws ----STX---- ";
	}
	
}
