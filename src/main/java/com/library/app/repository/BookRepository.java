package com.library.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.library.app.model.Books;

// This will be AUTO IMPLEMENTED by Spring into a Bean called bookRepository
// CRUD refers Create, Read, Update, Delete

public interface BookRepository extends CrudRepository<Books, Integer> {

}