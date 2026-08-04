# Secure User Management API

A production-inspired full-stack authentication and authorization system built with React, Tailwind CSS, Spring Boot, Spring Security, JWT, and MySQL. The application provides secure user registration, login, and role-based access control with a modern responsive frontend and a scalable RESTful backend architecture.

---

## 🛠️ Tech Stack

### Frontend
* **Core:** React (Vite)
* **Styling:** Tailwind CSS
* **Routing:** React Router
* **HTTP Client:** Axios

### Backend
* **Framework:** Spring Boot
* **Security:** Spring Security, JWT (JSON Web Token)
* **ORM:** Spring Data JPA / Hibernate
* **Architecture:** RESTful APIs

### Database
* **Relational DB:** MySQL

---

## ✨ Key Features

* **Secure Authentication:** User registration and login flows.
* **Stateless Sessions:** JWT-based authentication.
* **Access Control:** Role-based authorization (ADMIN / USER).
* **Protected Routes:** Secure endpoints on both frontend and backend.
* **Cryptography:** Password encryption using BCrypt.
* **Modern UI:** Responsive design built with Tailwind CSS.
* **UX Focus:** Form validation, loading states, and error handling.
* **Data Persistence:** User and role management with MySQL.

---

## 🚀 Project Highlights

### Backend Highlights
* Implemented a robust **Spring Security filter chain** for seamless authentication and authorization.
* Used **JWT access tokens** to secure API endpoints without relying on server-side sessions.
* Applied **BCrypt password hashing** before storing credentials in the database to ensure data privacy.
* Designed complex **entity relationships** for users and roles using JPA/Hibernate.
* Created **custom authentication and authorization logic** for strictly protected resources.
* Structured the project using a clean **Controller → Service → Repository** architecture.

### Frontend Highlights
* Built a sleek, responsive authentication UI using **React and Tailwind CSS**.
* Implemented **protected routes** that dynamically render based on authentication state and user roles.
* Managed **JWT tokens securely** within the client application.
* Integrated backend APIs using **Axios with centralized request handling** and interceptors.
* Added comprehensive, **user-friendly validation**, loading states, and explicit error feedback.

---

## 🗄️ Database Design

### Tables
* `users`
* `roles`
* `user_roles`

### Relationships
* **Many-to-Many** mapping between `users` and `roles`.
* Utilizes **indexed fields** for highly efficient authentication queries.

---

## 🔒 Security Considerations

* **Zero Plain-Text:** Passwords are mathematically hashed and never stored in plain text.
* **Stateless Auth:** Entirely token-based (JWT) to mitigate session hijacking risks.
* **Endpoint Restrictions:** Strict, role-based access control (RBAC) on API routes.
* **CORS Configured:** Secure Cross-Origin Resource Sharing configuration for frontend-backend communication.
* **Dual Validation:** Input data is strictly validated on both the client and server sides.

---

## 🏗️ Architecture Flow

```text
  React + Tailwind
         ↓
  REST API (Axios)
         ↓
    Spring Boot
         ↓
Spring Security + JWT
         ↓
  JPA / Hibernate
         ↓
       MySQL