package com.john.AddressBook.repository;

import org.springframework.data.repository.CrudRepository;

import com.john.AddressBook.model.Person;

public interface PersonBookRepository extends CrudRepository<Person, Integer> { }
