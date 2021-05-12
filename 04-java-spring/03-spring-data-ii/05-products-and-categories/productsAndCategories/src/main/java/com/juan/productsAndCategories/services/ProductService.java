package com.juan.productsAndCategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.productsAndCategories.models.Product;
import com.juan.productsAndCategories.repositories.ProductRepository;

@Service
public class ProductService {
	private ProductRepository pRepo;
	
	public ProductService(ProductRepository repo) {
		this.pRepo = repo;
	}
	
	// Get all products
	public List<Product> getAllProducts() {
		return this.pRepo.findAll();
	}
	
	// get one product
	public Product getSingleProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	// create product
	public Product createProduct(Product newProduct) {
		return this.pRepo.save(newProduct);
	}
}
