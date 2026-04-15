-- Sample Data

-- Customers Data
INSERT INTO Customers VALUES(1, 'Alice', 'Hyderabad')
INSERT INTO Customers VALUES(2, 'Bob', 'Delhi');
INSERT INTO Customers VALUES(3, 'Nanda', 'Hyderabad');
INSERT INTO Customers VALUES(4, 'Praveen', 'Chennai');
INSERT INTO Customers VALUES(5, 'Sagun', 'Jaipur');

-- Products Data
INSERT INTO Products VALUES(101, 'Laptop', 'Electronics', 60000.00);
INSERT INTO Products VALUES(102, 'Shoes', 'Fashion', 2000.00);
INSERT INTO Products VALUES(103, 'Smartphone', 'Electronics', 35000.00);
INSERT INTO Products VALUES(104, 'T-Shirt', 'Fashion', 800.00);
INSERT INTO Products VALUES(105, 'Notebook', 'Stationery', 20.00);

INSERT INTO Orders VALUES(1001, 1, '2026-03-01')
INSERT INTO Orders VALUES(1002, 2, '2026-03-15');
INSERT INTO Orders VALUES(1003, 3, '2026-03-20');
INSERT INTO Orders VALUES(1004, 5, '2026-04-01');
INSERT INTO Orders VALUES(1005, 1, '2026-04-05');

INSERT INTO Order_Items VALUES(1001, 101, 2)
INSERT INTO Order_Items VALUES(1002, 102, 3);
INSERT INTO Order_Items VALUES(1003, 104, 2);
INSERT INTO Order_Items VALUES(1004, 105, 5);
INSERT INTO Order_Items VALUES(1005, 102, 1);