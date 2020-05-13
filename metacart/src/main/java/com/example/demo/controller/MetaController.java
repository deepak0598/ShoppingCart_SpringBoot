package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;

@RestController
public class MetaController {
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/getCategory/{id}")
	public Optional<Category> getCategoryById(@PathVariable int id) {
		return categoryRepository.findById(id);
	}
	
	@GetMapping("/getCategory")
	public List<Category> getCategory() {
		return categoryRepository.findAll();
	}
	
	@PostMapping(value="/addCategory")
	public Category addCategory(@RequestBody Category category) {
		categoryRepository.save(category);
		return category;
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		productRepository.save(product);
		return product;
	}
	
	@GetMapping("/getProduct/{id}")
	public Optional<Product> getProduct(@PathVariable int id) {
		return productRepository.findById(id);
	}
	
	@GetMapping("/getProduct")
	public List<Product> getProduct() {
		return productRepository.findAll();
	}
}
