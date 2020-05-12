package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.CategoryRepository;

@RestController
public class MetaController {
	public MetaController() {
		System.out.println("Hello const");
	}
	@Autowired
	CategoryRepository categoryRepository;
	
	@RequestMapping("/")
	public void get() {
		System.out.println("hola");
	}
	@RequestMapping("/getData")
	@ResponseBody
	public String getData() {
		System.out.println("Hello deepak");
		return categoryRepository.findAll().toString();
	}
}
