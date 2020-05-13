package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="productId")
	private int productId;
	
	@ManyToOne
	@JoinColumn(nullable = false,name="categoryId")
	private Category category;
	
	@Column(name="ProductName",nullable = false)
	private String ProductName;
	
	@Column(name="productPrice",nullable = false)
	private int productPrice;
	
	@Column(name="productDetail",nullable = false)
	private String productDetail;
	
	@Column(name="productImage",nullable = false)
	private String productImage;
}