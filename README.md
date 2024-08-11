# SpringBoot-Multiple-DataIntegrityViolationException

This project is a Spring Boot CRUD application for managing a `Customers` profiles and for exception handling od multiple DataIntegrityViolationException.

## Features

- Add new Customer
- List all Customers profiles
- Validation of new Customers entry
- Phone No, account no and username Validation for unique
- exception's handling
- Global exception handler for validation errors

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- postgreSQL (can be replaced with any other database)
- Spring Validation

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```sh
   https://github.com/KoushalKumar22/SpringBoot-Multiple-DataIntegrityViolationException.git
   cd SpringBoot-Multiple-DataIntegrityViolationException
2. Build the project:
   ```sh
     mvn clean install
3. Run the application:
   ```sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: `/test`

- Method: GET

- Description: Test the API to ensure it's running

- Response: "This Is A Test Run"

2. Save DATA
- URL: `/save`
- Method: POST
- Description: Save a new customer data record to the database
- Request Body: json in postman
  ```sh
    {
    "username": "taskmaster",
    "name": "Koushal",
    "phone": "9876543201",
    "accNo": "12345678902"
    }

3. Get All Users
- URL: `/all`
- Method: GET
- Description: Returns a list of all Customers profiles.
  
4. Validation
- username: Must not be empty, and must be unique.
- phone no must be unique.
- Account no must be unique.

### Exception Handling

The application includes a global exception handler that captures `MethodArgumentNotValid` and returns a meaningful error response.
- example error response
  ```sh
   {
  "username": "Username Already exist",
  "phoneno": "phone no already registered",
  "accNo": "account no already exist",
  }
### Project Structure

- `Customer`: Entity class representing a Customer profile.
- `CustomerRepository`: Repository interface for CRUD operations on user profiles.
- `GlobalExceptionHandler`: Global exception handler for Multiple DataIntegrityViolationException errors.
- `CustomerController`: REST controller for handling Customer-related requests.

## Acknowledgements

I would like to thank the following resources and individuals who made this project possible:

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate](http://hibernate.org/)
- [Spring Validation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#validation)
- [JetBrains](https://www.jetbrains.com/idea/)
- [Stack Overflow](https://stackoverflow.com/)
