package com.juan.show.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.juan.show.models.Book;

@Controller
public class BookController {
	@GetMapping("/books/{id}")
	public String findBookById(Model viewModel, @PathVariable("id") Long id) {
		return "book.jsp";
	}
	
	@GetMapping("/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "redirect:/book";
	}
	
}
