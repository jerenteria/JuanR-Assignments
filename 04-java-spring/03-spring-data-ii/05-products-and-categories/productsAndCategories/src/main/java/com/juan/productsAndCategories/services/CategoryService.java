package com.juan.productsAndCategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.productsAndCategories.models.Category;
import com.juan.productsAndCategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	private CategoryRepository cRepo;
	
	public CategoryService(CategoryRepository repo) {
		this.cRepo = repo;
	}
	
	// get all categories
	public List<Category> getAllCategories() {
		return this.cRepo.findAll();
	}
	
	// get one category
	public Category getSingleCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	// create category
	public Category createCategory(Category newCategory) {
		return this.cRepo.save(newCategory);
	}
}
