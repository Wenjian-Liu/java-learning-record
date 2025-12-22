# User Register / Login System (OOP Case)

## Overview
A simple Java console-based system implementing user registration, login, and logout.
This project is built as an object-oriented practice focusing on **layered architecture** and **separation of concerns**.

## Architecture
The system is structured into clear layers:

- **UI Layer**
  - Handles user input and output
  - Interacts with the service layer only

- **Service Layer**
  - Encapsulates business logic (registration, authentication, logout)
  - Coordinates between UI and DAO

- **DAO Layer**
  - Manages user data access and storage
  - Provides data operations to the service layer

- **Model**
  - Defines the user data structure

## Key Learning Points
- Practiced requirement analysis and object modeling
- Applied layered design to reduce coupling
- Isolated business logic from UI and data access
- Improved understanding of method collaboration across layers

## Scope
- User registration
- User login authentication
- User logout

## Status
- Completed as a learning-oriented OOP case following tutorial guidance
