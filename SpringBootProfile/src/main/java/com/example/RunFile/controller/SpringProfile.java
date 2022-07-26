package com.example.RunFile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringProfile {
	@Value("${spring.profile.message}")
	private String message;
	
	@GetMapping(value = "/profile")
	public String printMessage() {
		return message;
	}

}
