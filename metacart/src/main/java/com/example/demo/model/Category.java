package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="category")
public class Category {
	@Id
	@Column(name="categoryId")
	private int categoryId;
	@Column(name="categoryName")
	private String categoryName;
}
