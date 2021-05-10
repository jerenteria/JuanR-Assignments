package com.juan.dojosAndNinjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.dojosAndNinjas.models.Dojo;
import com.juan.dojosAndNinjas.services.DojoService;
import com.juan.dojosAndNinjas.services.NinjaService;

@Controller
@RequestMapping("/dojos/new")
public class DojoController {
	@Autowired
	private DojoService dService;
	@Autowired
	private NinjaService nService;
	
	@GetMapping("")
	public String index(@ModelAttribute("dojo")Dojo dojo) {
		return "index.jsp";
	}
	
	@PostMapping("")
	public String createDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
		return "index.jsp";
		}
		this.dService.createDojo(dojo);
		return "redirect:/";
	}
	
}
