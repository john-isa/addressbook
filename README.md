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
- Java 15

### Running
The application can be run by executing the Spring Boot Jar
