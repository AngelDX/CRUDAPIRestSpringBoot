INSERT INTO categories (id, name) VALUES (1,'Computadoras');
INSERT INTO categories (id, name) VALUES (2,'Electrodomesticos');
INSERT INTO categories (id, name) VALUES (3,'Libros');

INSERT INTO products (id,name,description,quantity,price,created_at,available,category_id) VALUES(1,'licuadora Oster','500 watts facil uso',10,160.80,'2020-09-16',TRUE,2);
INSERT INTO products (id,name,description,quantity,price,created_at,available,category_id) VALUES(2,'PC gamer Pro','Para juegos de alto rendimiento',2,5000,'2020-09-14',TRUE,1);
INSERT INTO products (id,name,description,quantity,price,created_at,available,category_id) VALUES(3,'PC escritorio','Uso de oficina basico',5,2500,'2020-09-16',TRUE,1);
INSERT INTO products (id,name,description,quantity,price,created_at,available,category_id) VALUES(4,'Programación Java 11','Aprende a programar en 21 dias',10,50.32,'2020-09-16',TRUE,3);
