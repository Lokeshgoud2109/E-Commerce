# 🛒 E-Commerce Web Application

A full-stack e-commerce application where users can browse products, add them to a cart, and place orders. The backend is built with **Spring Boot** and exposes REST APIs, and the frontend is built with **React**.

## ✨ Features

- 🛍️ View all products with image, name, brand, price, and availability
- 📄 Product details page with description, category, release date, and stock
- 🔍 Search products by name, brand, or category
- 🛒 Add items to the cart, remove them, and update quantities
- 📦 Place orders, with stock updated after checkout
- ⚙️ Add, update, and delete products, including image upload

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Frontend | React, Axios, React Router, Bootstrap/CSS |
| Backend | Java, Spring Boot, Spring Web, Spring Data JPA |
| Database | H2 / MySQL / PostgreSQL |
| Build Tools | Maven, npm/Vite |

## 📁 Project Structure

```
E-Commerce/
├── SpringEcom/        # Spring Boot backend
│   ├── controller/    # REST controllers
│   ├── service/       # Business logic
│   ├── repo/          # JPA repositories
│   └── model/         # Entity classes
└── frontend/          # React frontend (if included)
```

## 🔌 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/products` | Get all products |
| GET | `/api/product/{id}` | Get a product by ID |
| POST | `/api/product` | Add a new product (with image) |
| PUT | `/api/product/{id}` | Update a product |
| DELETE | `/api/product/{id}` | Delete a product |
| GET | `/api/products/search?keyword=` | Search products |

## 🚀 Getting Started

### Prerequisites

- Java 17 or later
- Maven
- Node.js and npm (for the frontend)
- MySQL (optional, if not using H2)

### Run the Backend

```bash
git clone https://github.com/Lokeshgoud2109/E-Commerce.git
cd E-Commerce/SpringEcom
mvn spring-boot:run
```

The backend starts at `http://localhost:8080`.

If you are using MySQL, update `src/main/resources/application.properties` with your own database URL, username, and password.

### Run the Frontend

```bash
cd frontend
npm install
npm run dev
```

The frontend starts at `http://localhost:5173`.

## 📸 Screenshots

_Add screenshots of the home page, product page, and cart here._

## 🔮 Future Improvements

- User login and authentication (Spring Security + JWT)
- Online payment integration
- Order history for users
- Admin dashboard

## 🙌 Acknowledgements

Inspired by the Spring Boot + React e-commerce tutorial by [Telusko](https://www.youtube.com/@Telusko).

## 👤 Author

**Lokesh Goud**
GitHub: [@Lokeshgoud2109](https://github.com/Lokeshgoud2109)
