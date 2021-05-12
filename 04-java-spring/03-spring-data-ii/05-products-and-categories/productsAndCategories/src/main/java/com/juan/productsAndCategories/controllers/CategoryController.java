package com.juan.productsAndCategories.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.productsAndCategories.models.Category;
import com.juan.productsAndCategories.services.CategoryService;
import com.juan.productsAndCategories.services.ProductService;

@Controller
@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	private ProductService pService;
	@Autowired
	private CategoryService cService;
	
	
	@GetMapping("/new")
	public String newCategory(@ModelAttribute("category")Category category) {
		return "newCategory.jsp";
	}
	@PostMapping("/addCategory")
	public String addCategory(@Valid @ModelAttribute("category")Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "newCategory.jsp";
		}
		this.cService.createCategory(category);
		return "redirect:/categories/new";
	}
	@GetMapping("/{id}")
	public String showCategory(@PathVariable("id")Long id, Model viewModel) {
		Category categoryShown = this.cService.getSingleCategory(id);
		viewModel.addAttribute("category", categoryShown);
		return "showCategory.jsp";
	}
}
