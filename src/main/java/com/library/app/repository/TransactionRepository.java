package com.library.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.library.app.model.Transactions;

// This will be AUTO IMPLEMENTED by Spring into a Bean called bookRepository
// CRUD refers Create, Read, Update, Delete

public interface TransactionRepository extends CrudRepository<Transactions, Integer> {

}