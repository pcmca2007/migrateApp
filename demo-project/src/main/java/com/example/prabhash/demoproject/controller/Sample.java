package com.example.prabhash.demoproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	
	@GetMapping("/")
	public String index() {
		
		return "Hello Prabhash how are you";
	}

}
