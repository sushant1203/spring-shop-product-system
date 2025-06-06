# Spring Boot Shop (Product Management System)

## 📖 Overview

This project is a fully functional web application for managing shops and their associated products, built with **Java** and the **Spring Boot framework**. It serves as a strong demonstration of core back-end development principles, including MVC architecture, data handling, and robust server-side validation.

Developed as a university assignment, this project was awarded a **perfect score of 100/100**, reflecting its high-quality implementation, adherence to detailed specifications, and clean, functional design.

---

## ✨ Key Features

* **Shop Management (CRUD):** View a list of all shops and create new shops.
* **Product Management (CRUD):** For each shop, view its list of products and add new products.
* **Context-Aware Forms:** The "Add Product" form is intelligently linked to its parent shop.
* **Server-Side Validation:** Ensures data integrity with custom validation rules for all data entry forms.
* **JSP View Layer:** Utilises JavaServer Pages (JSP) with JSTL for dynamic front-end rendering.
* **Zero-Config Data Store:** Runs with an in-memory list to simulate a database, requiring no external setup.

---

## 🛠️ Tech Stack

* **Backend:** Java 17, Spring Boot
* **Frameworks:** Spring MVC, Spring Validation
* **View Technology:** JSP (JavaServer Pages), JSTL
* **Build System:** Gradle

## 🚀 Getting Started

This project is designed to be run directly from the IntelliJ IDEA environment.

### Prerequisites

* **Java Development Kit (JDK)**: Version 17 or higher.
* **IntelliJ IDEA**

---

### Installation & Setup

1.  **Clone the repository:**
```bash
git clone https://github.com/sushant1203/spring-shop-product-system.git
cd spring-shop-product-system
```

2.  **Open the project in IntelliJ IDEA:**
    * Launch IntelliJ IDEA.
    * Select `File > Open...` from the main menu.
    * Navigate to and select the root folder of the cloned project.

3.  **Sync Gradle Dependencies:**
    * IntelliJ will automatically detect the **`build.gradle`** file.
    * Allow the IDE a few moments to download and sync all the necessary project dependencies.

4.  **Run the application:**
    * Navigate to the main application file: `src/main/java/co2123/hw1/Hw1Application.java`.
    * Click the green play icon ▶️ next to the `main` method.
    * Select **'Run Hw1Application'** from the context menu.

The application will start, and you will see the Spring Boot logs in the **Run** console within IntelliJ.

## Usage

Once the application is running, open your web browser and navigate to:

**`http://localhost:8080`**

From the home page, you can:
* Click the **"View All Shops"** link to see the initial list of shops.
* Add a new shop using the provided form.
* Click on a shop to view its products.
* Add a new product to a specific shop.
* Test the validation by submitting forms with invalid or empty data.

---

## 📄 License

* © [2025] [IBM] [Sushant Jasra Kumar] All Rights Reserved.

---
