CREATE DATABASE BookstoreDB;
USE BookstoreDB;

CREATE TABLE IF NOT EXISTS Book (
    bookID INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    author VARCHAR(50) NOT NULL,
    publisher VARCHAR(100) NOT NULL,
    year INT NOT NULL,
    quantity INT NOT NULL,
    sale_price DECIMAL(10, 2) NOT NULL,
    rent_price DECIMAL(10, 2) NOT NULL
);

CREATE TABLE IF NOT EXISTS Customer (
    customerID INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(15) UNIQUE NOT NULL,
    firstname VARCHAR(20) NOT NULL,
    lastname VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS Sale (
    saleID INT AUTO_INCREMENT PRIMARY KEY,
    customerID INT NOT NULL,
    bookID INT NOT NULL,
    saleDate DATE NOT NULL,
    totalPrice DECIMAL(10, 2) NOT NULL,
    quantity INT NOT NULL,
    FOREIGN KEY (customerID) REFERENCES Customer(customerID),
    FOREIGN KEY (bookID) REFERENCES Book(bookID)
);

CREATE TABLE IF NOT EXISTS Rental (
    rentalID INT AUTO_INCREMENT PRIMARY KEY,
    customerID INT NOT NULL,
    bookID INT NOT NULL,
    rentDate DATE NOT NULL,
    dueDate DATE NOT NULL,
    status ENUM('Active', 'Returned', 'Overdue') NOT NULL,
    totalPrice DECIMAL(10, 2) NOT NULL,
    quantity INT NOT NULL,
    FOREIGN KEY (customerID) REFERENCES Customer(customerID),
    FOREIGN KEY (bookID) REFERENCES Book(bookID)
);