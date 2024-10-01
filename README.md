# Department and Seller Management System

## Overview

This project is a simple system for managing **Departments** and **Sellers** using **Java** and **JDBC**. The application interacts with a relational database to perform basic **CRUD** operations (Create, Read, Update, Delete) on two main entities: **Department** and **Seller**. 

The system leverages APIs responsible for establishing connections to the database and handling SQL queries efficiently.

---

## Features

- **Department Management**:
  - Create, read, update, and delete departments.
  - Fetch department data from the database.

- **Seller Management**:
  - Create, read, update, and delete seller records.
  - Associate sellers with departments.
  - Fetch seller data from the database.

---

## Technologies Used

- **Java**: Core language for the project.
- **JDBC (Java Database Connectivity)**: Used for database interaction.
- **MySQL Database**: Relational database for storing and managing data (can be replaced with other databases).
- **DAO (Data Access Object) Pattern**: Ensures separation between the database access layer and the business logic.

---

## Getting Started

### Prerequisites

To run this project, you will need:

- Java Development Kit (JDK) 8 or higher.
- A MySQL (or another supported database) server.
- A suitable IDE (e.g., Eclipse, IntelliJ IDEA).
- MySQL JDBC Driver.

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/rodrigokferreira/demo-dao-jdbc.git
   
2. Set up the database:

Import the provided SQL script into your database to create the necessary tables (Department and Seller).
Update the database connection details in the project (e.g., DB.java):

private static final String URL = "jdbc:mysql://localhost:3306/your_database";
private static final String USER = "your_username";
private static final String PASSWORD = "your_password";

3. Add MySQL JDBC Driver:

Download the JDBC driver from the official MySQL site or Maven repository.
Add it to your project dependencies.

API Endpoints

Department API

Insert Department: Inserts a new department into the database.

departmentDao.insert(new Department(null, "Finance"));

Update Department: Updates an existing department.

departmentDao.update(new Department(1, "HR"));

Delete Department: Deletes a department by its ID.

departmentDao.deleteById(1);

Find Department by ID: Fetches department details by ID.

Department dep = departmentDao.findById(1);

Find All Departments: Fetches all departments from the database.

List<Department> list = departmentDao.findAll();

Project Structure

src/
│
├── application/
│   └── Program.java        # Main entry point for the application
│
├── model/
│   ├── entities/
│   │   ├── Department.java # Department entity class
│   │   └── Seller.java     # Seller entity class
│   │
│   ├── dao/
│   │   ├── DepartmentDao.java  # Interface for Department data access
│   │   ├── SellerDao.java      # Interface for Seller data access
│   │   └── DaoFactory.java     # Factory for DAO instances
│   │
│   └── dao/impl/
│       ├── DepartmentDaoJDBC.java # JDBC implementation of Department DAO
│       └── SellerDaoJDBC.java     # JDBC implementation of Seller DAO
│
└── db/
    ├── DB.java        # Handles database connection
    ├── DbException.java # Custom exception for database errors
    └── DbIntegrityException.java # Custom exception for integrity constraint violations

## Running the Application

After setting up the project, run the `Program.java` file from your IDE to execute the Department and Seller management functionalities.

---

## License

This project is open-source and free to use under the MIT License.

