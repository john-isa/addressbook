package com.john.AddressBook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long   Id;
    private String book;
    private String name;
    private String number;

    public Person () {}

    public Person(String book, String name, String number)
    {
        this.book   = book;
        this.name   = name;
        this.number = number;
    }

    public long getId()
    {
        return Id;
    }

    public void setId(long id)
    {
        Id = id;
    }

    public String getBook()
    {
        return book;
    }

    public void setBook(String book)
    {
        this.book = book;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }
}
