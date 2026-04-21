-- Top Products 
SELECT p.product_name, SUM(oi.quantity) AS total_sold
FROM Order_Items oi
JOIN Products p ON oi.product_id = p.product_id
GROUP BY p.product_name
ORDER BY total_Sold DESC;

-- Most Valuable Customers
SELECT c.customer_name AS customer_name, SUM(oi.quantity * p.price) AS total_spent
FROM Customers c
JOIN Orders o ON c.customer_id = o.customer_id
JOIN Order_Items oi ON o.order_id = oi.order_id
JOIN Products p ON oi.product_id = p.product_id
GROUP BY c.customer_name
ORDER BY total_spent DESC;

-- Monthly Revenue
SELECT TO_CHAR(o.order_date, 'YYYY-MM') AS month,
       SUM(p.price * oi.quantity) AS revenue
FROM orders o
JOIN order_items oi ON o.order_id = oi.order_id
JOIN products p ON oi.product_id = p.product_id
GROUP BY TO_CHAR(o.order_date, 'YYYY-MM')
ORDER BY month;

-- Category Wise Sales
SELECT p.category, SUM(oi.quantity * p.price) AS category_sales
FROM Order_Items oi
JOIN Products p ON oi.product_id = p.product_id
GROUP BY p.category
ORDER BY category_sales DESC;

-- Inactive Customers
SELECT c.customer_name AS name
FROM Customers c
LEFT JOIN Orders o ON c.customer_id = o.customer_id
WHERE o.order_id IS NULL;