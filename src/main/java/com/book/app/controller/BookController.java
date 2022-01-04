package com.book.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.book.app.model.BookModel;
import com.book.app.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	// create
	@RequestMapping(value = "/api/book", method = RequestMethod.POST)
	public void addBook(@RequestBody BookModel book) {
		service.addStudent(book);
	}
	
	// read all
	@RequestMapping("/api/books")
	public List<BookModel> getBooks() {
		return service.getBooks();
	}
	
	// read single
	@RequestMapping("/api/book/{id}")
	public Optional<BookModel> getBook(@PathVariable Integer id) {
		return service.getBook(id);
	}
	
	// update
	@RequestMapping(value = "/api/book/{id}", method = RequestMethod.PUT)
	public void updateBook(@PathVariable Integer id, @RequestBody BookModel book) {
		service.updateBook(id, book);
	}
	
	// delete
	@RequestMapping(value = "/api/book/{id}", method = RequestMethod.DELETE)
	public void deleteBook(@PathVariable Integer id) {
		service.deleteBook(id);
	}
	
}
