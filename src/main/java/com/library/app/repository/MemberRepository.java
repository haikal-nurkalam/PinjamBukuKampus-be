package com.library.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.library.app.model.Members;

// This will be AUTO IMPLEMENTED by Spring into a Bean called bookRepository
// CRUD refers Create, Read, Update, Delete

public interface MemberRepository extends CrudRepository<Members, Integer> {

}