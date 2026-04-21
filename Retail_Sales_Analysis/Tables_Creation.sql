-- Customers Table
CREATE TABLE Customers (
    customer_id NUMBER PRIMARY KEY,
    customer_name VARCHAR2(100),
    city VARCHAR2(100)
);

-- Products Table
CREATE TABLE Products (
    product_id NUMBER PRIMARY KEY,
    product_name VARCHAR2(100),
    category VARCHAR2(50),
    price NUMBER(10,2)
);

-- Orders Table
CREATE TABLE Orders (
    order_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    order_date DATE,
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id)
);

-- Order_Items Table
CREATE TABLE Order_Items (
    order_id NUMBER,
    product_id NUMBER,
    quantity NUMBER,
    PRIMARY KEY (order_id, product_id),
    FOREIGN KEY (order_id) REFERENCES Orders(order_id),
    FOREIGN KEY (product_id) REFERENCES Products(product_id)
);