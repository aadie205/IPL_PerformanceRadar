package com.night.ipl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping
	public String getHelloWorld() {
		return "Welcome to IPL Performance Radar";
	}
}
