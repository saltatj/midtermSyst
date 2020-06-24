CREATE TABLE add_equipment (id INTNOTNULL Primary Key AUTO_INCREMENT,name VARCHAR(16),price DOUBLE(3,2), quantity INTEGER(20));

INSERT INTO add_equipment (name, price, quantity) VALUES 
('Beach ball', 3.99, 50 ),
('floaties', 5.99, 25),
('flipflops', 8.99, 10),
('Pool CLeaner', 20.00, 20),
('Pool Filter', 150.00, 5),
('Pool Heater', 200.00, 3),
('Pool Pumps', 125.00, 2),
('Diving Board', 75.00, 15),
('goggles', 3.25, 25),
('swimsuit', 10.99, 25);