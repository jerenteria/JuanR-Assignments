package com.juan.show.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/")
	public String update(@PathVariable("id")Long id, @RequestParam(value="name")String name, @RequestParam(value="language") String language, @RequestParam(value="pages")int numOfPages) {
		Book book = new Book();
		return "redirect:/book";
	}
	
}
