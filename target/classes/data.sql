-- ----------------------------------------------------------------------------
-- Making sure we have a clear field
-- ----------------------------------------------------------------------------
DROP DATABASE IF EXISTS AddressBook;

-- ----------------------------------------------------------------------------
-- Setting up the Address Book database
-- ----------------------------------------------------------------------------
CREATE DATABASE IF NOT EXISTS AddressBook;

USE AddressBook;                       -- Making sure we are referencing the DB

-- ----------------------------------------------------------------------------
-- Setting up for a new table for each person listed in the Address Book
-- ----------------------------------------------------------------------------
DROP TABLE IF EXISTS AddressBook.person;

-- ----------------------------------------------------------------------------
-- The actual PERSON entry table
-- ----------------------------------------------------------------------------
CREATE TABLE AddressBook.person
(
    id                INT         NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
    book              VARCHAR(50) NOT NULL,
    name              VARCHAR(50) NOT NULL,
    number            VARCHAR(50) NOT NULL
);

-- ----------------------------------------------------------------------------
-- Time to INSERT some data...
-- ----------------------------------------------------------------------------
INSERT INTO AddressBook.person (id, book, name, number) values (1, 'work', 'Peter', '55554444');
INSERT INTO AddressBook.person (id, book, name, number) values (2, 'work', 'Harry', '55553333');
INSERT INTO AddressBook.person (id, book, name, number) values (3, 'work', 'Brent', '55552222');

INSERT INTO AddressBook.person (id, book, name, number) values (4, 'home', 'Elizabeth', '55551111');
INSERT INTO AddressBook.person (id, book, name, number) values (5, 'home', 'Harry', '55553333');
INSERT INTO AddressBook.person (id, book, name, number) values (6, 'home', 'Eleanor', '55559999');

INSERT INTO AddressBook.person (id, book, name, number) values (7, 'friends', 'Peter', '55554444');
INSERT INTO AddressBook.person (id, book, name, number) values (8, 'friends', 'Elizabeth', '55551111');
INSERT INTO AddressBook.person (id, book, name, number) values (9, 'friends', 'Brent', '55552222');
