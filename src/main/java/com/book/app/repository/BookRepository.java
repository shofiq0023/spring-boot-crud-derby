package com.book.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.book.app.model.BookModel;

public interface BookRepository extends CrudRepository<BookModel, Integer> {

}
