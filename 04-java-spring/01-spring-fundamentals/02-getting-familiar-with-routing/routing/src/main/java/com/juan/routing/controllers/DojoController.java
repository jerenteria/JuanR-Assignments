package com.juan.routing.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@GetMapping("/")
	public String index() {
		return "The dojo is awesome";
	}
	
	@GetMapping("/burbank")
	public String burbank() {
		return "Burbank dojo is located in Southern California";
	}
	
	@GetMapping("/san-jose") 
	public String sanjo() {
		return "SJ dojo is the headquarters";
	}
}
