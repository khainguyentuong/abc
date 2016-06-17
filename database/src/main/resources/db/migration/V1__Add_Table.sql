CREATE TABLE person (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(30) NOT NULL,
	email VARCHAR(50) NULL,
	password VARCHAR(30) NOT NULL,
	mobile VARCHAR(16) NULL
);

CREATE UNIQUE INDEX person_idx ON person (name);

CREATE USER 'person' IDENTIFIED BY 'person';
GRANT ALL ON person.* TO 'person'@'%' IDENTIFIED BY 'person';
GRANT ALL ON person.* TO 'person'@'192.168.99.100' IDENTIFIED BY 'person';
FLUSH PRIVILEGES;