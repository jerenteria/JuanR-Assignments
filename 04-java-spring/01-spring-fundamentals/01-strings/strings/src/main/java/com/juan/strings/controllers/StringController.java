package com.juan.strings.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
	@GetMapping("/")
	public String index() {
		return "Hello client how are you doing?";
	}
	
	@GetMapping("/random")
	public String random() {
		return "Spring boot is great! So easy to just respond with strings";
	}
}
