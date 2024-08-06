# SpringMySQLStarter

## Features
REST Controller: Includes a REST controller that provides endpoints for managing Student entities. You can perform CRUD operations (Create, Read, Update, Delete) on the Student records through these endpoints.

JPA Repository: Contains a JPA repository for interacting with the MySQL database. The repository provides methods to save, find, update, and delete Student records without the need to write complex SQL queries.

Student Entity: Defines a Student object that maps to a STUDENT table in the MySQL database. The entity includes fields for id, mark, and name, and uses annotations to define how these fields map to the table columns.

## Setup
Database Configuration: Update the application.properties file with your MySQL database connection details.

Run the Application: Start the Spring Boot application using your preferred method (e.g., mvn spring-boot:run or running from your IDE).

Access Endpoints: Use the REST endpoints provided by the controller to interact with the Student records. The base URL for the API is /students.

## Example Endpoints
Get All Students: GET /students
Get Student by ID: GET /students/{id}
Create Student: POST /students
Update Student: PUT /students/{id}


## Dependencies:
- Spring Web
- Spring Data JPA
- MySQL Driver
- Lombok

