-- INSERT DATA INTO Book 
INSERT INTO Book (title, author, publisher, year, quantity, sale_price, rent_price) VALUES
('Ulysses', 'James Joyce', 'Shakespeare and Company', 1922, 25, 16.99, 2.99),
('The Great Gatsby', 'F. Scott Fitzgerald', 'Charles Scribner''s Son', 1925, 20, 15.49, 2.49),
('A Portrait of the Artist as a Young Man', 'James Joyce', 'B. W. Huebsch', 1916, 12, 10.79, 1.99),
('Lolita', 'Vladimir Nabokov', 'Olympia Press', 1955, 32, 10.99, 1.99),
('Brave New World', 'Aldous Huxley', 'Chatto & Windus', 1932, 20, 14.59, 1.99),
('The Sound and the Fury', 'William Faulkner', 'Jonathan Cape and Harrison Smith', 1929, 14, 15.49, 3.79),
('Catch-22', 'Joseph Heller', 'Simon & Schuster', 1961, 28, 20.49, 4.99),
('Darkness at Noon', 'Arthur Koestler', 'Jonathan Cape', 1940, 21, 13.99, 2.50),
('The Catcher in the Rye', 'J.D. Salinger', 'Little, Brown and Company', 1951, 22, 13.99, 2.79),
('Sons and Lovers', 'D.H.Lawrence', 'Gerald Duckworth and Company', 1913, 34, 16.50, 3.00),
('The Lord of the Rings', 'J.R.R. Tolkien', 'Allen & Unwin', 1954, 15, 35.00, 5.50),
('Under the Volcano', 'Malcolm Lowry', 'Reynal & Hitchcock', 1947, 22, 12.99, 2.99),
('Fahrenheit 451', 'Ray Bradbury', 'Ballantine Books', 1953, 19, 14.99, 2.89),
('To the Lighthouse', 'Virginia Woolf', 'Hogarth Press', 1927, 26, 14.50, 2.99),
('The Odyssey', 'Homer', 'Ancient Greece', 800, 16, 20.00, 4.00);


-- INSERT DATA INTO Customer
INSERT INTO Customer (username, firstName, lastName) VALUES
('emma_m', 'Emma', 'Malcolm'),
('blzoo10', 'Beck', 'Liu'),
('johndd', 'John', 'Duck'),
('hn123', 'Hane', 'Nguyen'),
('aliwil', 'Alice', 'Williams'),
('bobj34', 'Bob', 'Jimel'),
('kattyb', 'Katty', 'Brown'),
('ecnirp', 'Erick', 'Bolton'),
('et996', 'Emma', 'Taylor'),
('kimzoon', 'Zoon', 'Kim'),
('luna77', 'Luna', 'Haskey'),
('hannahus', 'Hannah', 'Cao'),
('juliar', 'Julia', 'Roberts'),
('ngok97', 'Kevin', 'Ngo'),
('miclee', 'Michael', 'Lee');


-- INSERT DATA INTO Sale (totalPrice = sale_price * quantity)
INSERT INTO Sale (customerID, bookID, saleDate, totalPrice, quantity) VALUES
(1, 1, '2026-10-02', 16.99, 1),
(2, 3, '2026-10-05', 21.58, 2),
(3, 5, '2026-10-07', 43.77, 3),
(4, 7, '2026-10-08', 61.47, 3),
(5, 9, '2026-10-10', 69.95, 5),
(6, 11, '2026-10-12', 35.00, 1),
(7, 13, '2026-10-15', 29.98, 2),
(8, 15, '2026-10-20', 40.00, 2),
(9, 2, '2026-10-24', 15.49, 1),
(10,4, '2026-10-29', 10.99, 1),
(11, 6, '2026-11-03', 46.47, 3),
(12, 8, '2026-11-05', 13.99, 1),
(13, 10, '2026-11-06', 33.0, 2),
(14, 12, '2026-11-10', 51.96, 4),
(15, 14, '2026-11-11', 14.50, 1);


-- INSERT DATA INTO Rental
-- assume a customer can rent a book for 14 days
INSERT INTO Rental (customerID, bookID, rentDate, dueDate, status, totalPrice, quantity) VALUES
(2, 1, '2026-10-01', '2026-10-15', 'Returned', 2.99, 1),
(4, 2, '2026-10-01', '2026-10-15', 'Active', 2.49, 1),
(6, 3, '2026-10-02', '2026-10-16', 'Returned', 1.99, 1),
(8, 4, '2026-10-05', '2026-10-19', 'Overdue', 1.99, 1),
(10, 5, '2026-10-10', '2026-10-24', 'Active', 1.99, 1),
(12, 6, '2026-10-13', '2026-10-27', 'Active', 3.79, 1),
(14, 7, '2026-10-16', '2026-10-30', 'Returned', 4.99, 1),
(15, 8, '2026-10-19', '2026-11-03', 'Overdue', 2.50, 1),
(13, 9, '2026-10-22', '2026-11-06', 'Active', 2.79, 1),
(11, 10, '2026-10-25', '2026-11-09', 'Active', 3.00, 1),
(9, 11, '2026-10-30', '2026-11-14', 'Active', 5.50, 1),
(7, 13, '2026-11-01', '2026-11-15', 'Returned', 2.99, 1),
(5, 12, '2026-11-05', '2026-11-19', 'Returned', 2.89, 1),
(3, 14, '2026-11-06', '2026-11-20', 'Active', 2.99, 1),
(1, 15, '2026-11-11', '2026-11-24', 'Returned', 4.00, 1);