package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class openShift {
	
	@RequestMapping("/greeting")
	public String greetingMessage() {
		return("Hello to open shift");
	}

}
