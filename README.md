# 📌 Order Management REST API

A real-world Spring Boot REST API implementing a **Customer → Orders (One-to-Many relationship)**.
Provides full CRUD operations for both Customer and Orders with clean API endpoints and MySQL integration.
Perfect for learning enterprise-level REST API development 🚀.

---

## 🚀 Features

### 👤 Customer APIs

* ➕ Create Customer
* 📄 Get All Customers
* 🔍 Get Customer by ID
* ✏️ Update Customer
* ❌ Delete Customer

### 🛒 Order APIs

* ➕ Create Order for a Customer
* 📄 Get All Orders of a Customer
* ✏️ Update Order
* ❌ Delete Order

### 🔗 Relationship

* **One Customer → Many Orders (One-to-Many)**

---

## 🛠 Tech Stack

* ☕ Java
* 🌱 Spring Boot
* 🗄 MySQL
* 📦 Spring Data JPA
* 📡 REST API
* 🧪 Postman

---

## 📦 Spring Initializr Dependencies

### ✔ Required

* Spring Web
* Spring Data JPA
* MySQL Driver

### ✔ Optional (Recommended)

* Lombok
* Spring Boot DevTools

---

## 🔧 application.properties

```
spring.datasource.url=jdbc:mysql://localhost:3306/order_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# 🧪 POSTMAN API TESTING

## ➤ 1. Create Customer (POST)

**URL:** `http://localhost:8080/api/customers`

```
{
  "name": "Manoj",
  "email": "manoj@gmail.com"
}
```

---

## ➤ 2. Create Order for a Customer (POST)

**URL:** `http://localhost:8080/api/orders/customer/1`

```
{
  "productName": "Keyboard",
  "quantity": 2,
  "price": 900
}
```

---

## ➤ 3. Get All Orders of a Customer (GET)

**URL:** `http://localhost:8080/api/orders/customer/1`

---

## ➤ 4. Update Order (PUT)

**URL:** `http://localhost:8080/api/orders/1`

```
{
  "productName": "Mechanical Keyboard",
  "quantity": 1,
  "price": 1800
}
```

---

## ➤ 5. Delete Order (DELETE)

**URL:** `http://localhost:8080/api/orders/1`

---

## ⭐ Show Support

If you like this project, don't forget to ⭐ the repository!

---

## 🙌 Author

**Manoj** — Full Stack Java Developer 🚀
