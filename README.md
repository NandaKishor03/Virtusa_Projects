# 📚 Multi-Project Repository: Python, SQL & Java Systems

Welcome to this repository!  
This repo contains three complete projects across different technologies — **Python, SQL, and Java** — designed to demonstrate practical problem-solving, clean architecture, and real-world application development.

---

## 1️⃣ Smart Expense Tracker with Insights (Python)

### 📌 Problem Statement
Many individuals struggle to track daily expenses and understand spending patterns. This project provides a Python application that allows users to log, categorize, and analyze their expenses.

### 🎯 Objectives
- Record daily expenses (date, category, amount, description)  
- Categorize spending (Food, Travel, Bills, etc.)  
- Generate monthly summaries and insights  

### ✨ Key Features
- CLI-based input system  
- Data storage using CSV or JSON  
- Monthly expense summary  
- Category-wise breakdown (pie chart using Matplotlib)  
- Detect highest spending category  

### 🛠️ Tech Stack
- Python  
- Pandas (data handling)  
- Matplotlib (visualization)  
- CSV / JSON for storage  

### ▶️ How to Run
```bash
cd expense-tracker
pip install pandas matplotlib
python main.py


## 🛒 Online Retail Sales Analysis Database (SQL)

### 📌 Problem Statement
Retail businesses generate huge sales data but lack structured insights.  
This project designs a relational database and SQL queries to analyze sales performance.

---

## 🎯 Objectives
- Create a relational database for an online store  
- Store customer, product, and order data  
- Extract meaningful insights using SQL queries  

---

## 🗄️ Database Schema
- **Customers** (customer_id, name, city)  
- **Products** (product_id, name, category, price)  
- **Orders** (order_id, customer_id, date)  
- **Order_Items** (order_id, product_id, quantity)  

---

## 🔑 Key Tasks
- Find top-selling products  
- Identify most valuable customers  
- Monthly revenue calculation  
- Category-wise sales analysis  
- Detect inactive customers  

---

## 🛠️ Tech Stack
- MySQL / PostgreSQL  
- SQL Joins (INNER, LEFT, GROUP BY, HAVING)  
- Aggregate Functions  

---

## ▶️ How to Run
```sql
-- Create database
CREATE DATABASE retail_sales;

-- Switch to database
USE retail_sales;

-- Execute schema.sql
SOURCE schema.sql;

-- Run queries.sql
SOURCE queries.sql;



---

### 📂 Java Project — Library Management System

```markdown
# 📚 Library Management System (Java)

### 📌 Problem Statement
Libraries often face difficulty managing book inventory and issuing records manually.  
This project develops a Java-based system to automate library operations.

---

## 🎯 Objectives
- Manage books, users, and transactions  
- Track issued and returned books  

---

## ✨ Key Features
- Add, update, delete books  
- User registration system  
- Issue & return books with due dates  
- Fine calculation for late returns  
- Search books by title/author  

---

## 🛠️ Tech Stack
- Core Java (OOP concepts)  
- Optional: JDBC + MySQL for database integration  
- Console-based interface or GUI (Swing/JavaFX)  

---

## ▶️ How to Run
```bash
javac Main.java
java Main
