package com.book.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookModel {
	
	@Id
	private Integer id;
	private String name;
	private String author;
	private String description;
	
	public BookModel() {
		super();
	}
	public BookModel(String name, String author, String description) {
		super();
		this.name = name;
		this.author = author;
		this.description = description;
	}

	public BookModel(int id, String name, String author, String description) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
