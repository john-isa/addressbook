package com.john.AddressBook;

import com.john.AddressBook.model.Person;
import com.john.AddressBook.repository.PersonBookRepository;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PersonApplicationTests
{
	@Autowired
	PersonBookRepository repository;

	@Test
	void contextLoads() {}

	@Test
	public void whenCalledCheckTheCorrectNumberOfPersons()
	{
		repository.save(new Person());
		List<Person> persons = (List<Person>) repository.findAll();

		assertThat(persons.size()).isEqualTo(10);       // the 10 is the value of the next id to be used. actual size is 9
	}
}
