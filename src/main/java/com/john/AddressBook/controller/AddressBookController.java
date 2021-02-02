package com.john.AddressBook.controller;

import com.john.AddressBook.model.Person;
import com.john.AddressBook.repository.PersonBookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(path = "/v1/address-book/")
public class AddressBookController
{
    private static final Logger LOG = LoggerFactory.getLogger(AddressBookController.class);

    @Autowired
    private PersonBookRepository repository;

    @PostMapping(path = "/add")
    public @ResponseBody String add(@RequestParam String book, @RequestParam String name, @RequestParam String number)
    {
        Person person = new Person();

        LOG.info("********** : Adding some data in the address books : ");

        person.setBook(book);
        person.setName(name);
        person.setNumber(number);

        repository.save(person);

        return "saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Person> getAllPersons()
    {
        LOG.info("********** : Fetching all the data in all the address books : ");
        return repository.findAll();
    }

    @GetMapping(value = "/all/unique?{name1}&{name2)")
    public @ResponseBody List<Person> getUniquePersons(@PathVariable(name="name1") Integer name1, @PathVariable(name="name2") Integer name2)
    {
        LOG.info("********** : Looking for uniqure entries between any two address books");

        Iterable<Person> book  = repository.findAll();

        List<Person>     book1 = new ArrayList<Person>();
        List<Person>     book2 = new ArrayList<Person>();
        Person           p1    = new Person();
        Person           p2    = new Person();

        LOG.info("********** : Looking for the address books : " + name1 + " and " + name2);

//        for (Person person : book)
//        {
//            if (person.getBook().equals(name1))
//            {
//                p1.setName(person.getName());
//                p2.setName(person.getName());
//
//                book1.add(p1);
//            }
//            if (person.getBook().equals(name2))
//            {
//                p1.setName(person.getName());
//                p2.setName(person.getName());
//
//                book2.add(p2);
//            }
//            LOG.info("********** : " + person.getBook() + " : " + name1);
//            LOG.info("********** : " + person.getBook() + " : " + name2);
//        }
//
//        book1.removeAll(book2);
//        book2.removeAll(book1);
//        book1.addAll(book2);

        return (List)book;
    }

    public List<Person> difference(List<Person> first, List<Person> second)
    {
        List<Person> difference = new ArrayList<>(first);
        difference.removeAll(second);

        return difference;
    }


    @GetMapping(path = "/error")
    public @ResponseBody String error()
    {
        return "wrong!";
    }
}
