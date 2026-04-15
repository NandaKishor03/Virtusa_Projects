-- Customers Table
CREATE TABLE Customers(
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100),
    city VARCHAR(100)
);

-- Products Table
CREATE TABLE Products(
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    category VARCHAR(50),
    price DECIMAL(10,2)
);

-- Orders Table
CREATE TABLE Orders(
    order_id INT PRIMARY KEY,
    customer_id INT,
    order_date DATE,
    FOREIGN KEY (customer_id) REFERENCE Customers(customer_id)
);

-- Order_Items Table
CREATE TABLE Order_Items(
    order_id INT,
    product_id INT,
    quantity INT,
    PRIMARY KEY (order_id, product_id),
    FOREIGN KEY (order_id) REFERENCE Orders(order_id),
    FOREIGN KEY (product_id) REFERENCE Products(product_id)
);