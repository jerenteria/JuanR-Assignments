package com.juan.displayDate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateController {
	@GetMapping("/")
	public String index() {
		return "home.jsp";
	}
	@GetMapping("/date")
	public String date() {
		return "date.jsp";
	}
	
	@GetMapping("/time")
		public String time() {
			return "time.jsp";
		}
	
}
