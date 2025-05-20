CREATE DATABASE IF NOT EXISTS professeurs_db;
USE professeurs_db;
CREATE TABLE professeur (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    prenom VARCHAR(50),
    email VARCHAR(100)
);
INSERT INTO professeur (nom, prenom, email) VALUES
('Idrais', 'Jaafar', 'jaa@univ.ma'),
('Marimi', 'Jamila', 'jam@univ.ma'),
('Bodan', 'Lahcen', 'luc@univ.ma');
