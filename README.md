# 🏢 Employee Management System (EMS)

Welcome to the Employee Management System! This is a full-stack web application built with Spring Boot that allows for easy management of employee records. It provides complete CRUD (Create, Read, Update, Delete) functionality in a user-friendly interface. 🚀

This project was built as a hands-on learning experience to demonstrate the integration of a Java backend with a NoSQL database and a dynamic HTML frontend.

## ✨ Features

This application comes with a complete set of features for managing employee data:

### View All Employees: 📋 Displays all employee records in a clean, organized table.

### Add New Employee: ➕ A pop-up modal form allows for the seamless addition of new employees to the database.

### Update Employee Information: ✏️ Easily edit the details of any existing employee. The update form comes pre-filled with their current data.

### Delete Individual Employee: 🗑️ Remove a single employee record with a confirmation step.

### Delete All Employees: 💥 A secure option to wipe all records from the database after typing a confirmation message.

### Responsive UI: 📱 The interface is built with Bootstrap, making it usable on both desktop and mobile devices.

## 🛠️ Tech Stack

This project leverages a modern and powerful set of technologies:

### Backend:

Java 17: The core programming language.

Spring Boot: Framework for building the robust backend and web server.

Spring MVC: For handling web requests in the Controller layer.

Spring Data MongoDB: For seamless integration with the MongoDB database.

### Frontend:

Thymeleaf: A server-side Java template engine for rendering dynamic HTML.

Bootstrap 5: For creating a responsive and modern user interface.

HTML & CSS: For the structure and custom styling.

Database:

MongoDB: A flexible and scalable NoSQL database used to store employee data.

### Build Tool:

Gradle: For managing project dependencies and building the application.

## 📂 Project Structure

The project follows the standard Model-View-Controller (MVC) architectural pattern to ensure a clean separation of concerns.

src/main/java/com/ems/app/
├── 📁 controller/   // Handles incoming HTTP requests (e.g., from the browser)
│   └── EmployeeController.java
├── 📁 pojo/         // Plain Old Java Objects that define our data structure (the "Model")
│   ├── Employee.java
│   └── ConfirmationForm.java
└── 📁 repo/         // The Repository layer for database communication
    └── EmployeeRepo.java


## 🚀 Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites

Make sure you have the following software installed on your system:

Java Development Kit (JDK) 17 or later.

MongoDB Community Server.

An IDE like IntelliJ IDEA or VS Code.

### How to Run

### Clone the repository:

git clone [https://github.com/YourUsername/your-repo-name.git](https://github.com/YourUsername/your-repo-name.git)


### Navigate to the project directory:

cd your-repo-name


Start your MongoDB Server: Ensure that the MongoDB service is running in the background.

Run the application: Open the project in your IDE and run the EmployeeManagementSystemApplication.java file.

Open your browser: Navigate to http://localhost:8080 and you should see the application live! 🎉

## Author
  Aman Manwatkar
