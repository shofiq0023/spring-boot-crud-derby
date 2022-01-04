package com.book.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.app.model.BookModel;
import com.book.app.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repo;
	
	// create
	public void addStudent(BookModel book) {
		repo.save(book);
	}
	
	// read all
	public List<BookModel> getBooks() {
		List<BookModel> books = new ArrayList<>();
		repo.findAll().forEach(books::add);
		return books;
	}
	
	// read single
	public Optional<BookModel> getBook(Integer id) {
		return repo.findById(id);
	}
	
	// update
	public void updateBook(Integer id, BookModel book) {
		repo.save(book);
	}
	
	// delete
	public void deleteBook(Integer id) {
		repo.deleteById(id);
	}
	
}
