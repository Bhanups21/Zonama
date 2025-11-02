CREATE DATABASE IF NOT EXISTS zonama;
USE zonama;

CREATE TABLE products (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(255),
    category VARCHAR(50),
    brand VARCHAR(50),
    price DECIMAL(10,2),
    available_quantity INT
);
