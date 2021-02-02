package com.john.AddressBook;

import com.john.AddressBook.model.Person;
import com.john.AddressBook.repository.PersonBookRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase
{
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PersonBookRepository repository)
    {
        return args -> {
            log.info("Preloading " + repository.save(new Person("work", "Peter", "55554444")));
            log.info("Preloading " + repository.save(new Person("work", "Harry", "55553333")));
            log.info("Preloading " + repository.save(new Person("work", "Brent", "55552222")));

            log.info("Preloading " + repository.save(new Person("home", "Elizabeth", "55551111")));
            log.info("Preloading " + repository.save(new Person("home", "Harry", "55553333")));
            log.info("Preloading " + repository.save(new Person("home", "Eleanor", "55559999")));

            log.info("Preloading " + repository.save(new Person("friends", "Peter", "55554444")));
            log.info("Preloading " + repository.save(new Person("friends", "Elizabeth", "55551111")));
            log.info("Preloading " + repository.save(new Person("friends", "Brent", "55552222")));
        };
    }
}