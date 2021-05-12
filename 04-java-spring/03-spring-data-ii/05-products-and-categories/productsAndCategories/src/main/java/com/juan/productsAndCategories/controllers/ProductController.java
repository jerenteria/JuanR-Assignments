package com.juan.productsAndCategories.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.productsAndCategories.models.Product;
import com.juan.productsAndCategories.services.CategoryService;
import com.juan.productsAndCategories.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService pService;
	@Autowired
	private CategoryService cService;
	
	
	@GetMapping("/new")
	public String newProduct(@ModelAttribute("product")Product product) {
		return "newProduct.jsp";
	}
	@PostMapping("/addProduct")
	public String addProduct(@Valid @ModelAttribute("product")Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newProduct.jsp";
		}
		this.pService.createProduct(product);
		return "redirect:/products/new";
	}
}
