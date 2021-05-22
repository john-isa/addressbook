# Address-Book
This is a coding challenge that allows the saving, listing and comparison of address books.

## Design Decisions and Assumptions
- Storage is a MySQL database
- The application is has been built as a Restful API using Spring Boot (Spring MVC)
- Entities include addressBook which contains the following:
 * the address book name
 * the persons name and,
 * the persons phone number
- An address book may contain many entries, some of which may be duplicate persons with different phone numbers. These entries are considered to be unique to that address book.
- Due to time constraints, only test available is API test using curl.

### Prerequisites
- Java 11

### Running
The application can be run by executing the Spring Boot Jar

To run and test the application, please use curl, Postman or a browser:

#### CURL commands
This will show all the entries in the data base:
* curl localhost:8080/v1/address-book/all

This will show uniqure entries between any two address books
* curl localhost:8080/v1/address-book/all/unique?book1=work&book2=home

Using Postman:
* Set the Url to - http://localhost:8080/v1/address-book/add
and set the body in the form data to: book = hobby, name = John, number = 98765432
