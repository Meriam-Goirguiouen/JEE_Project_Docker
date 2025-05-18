CREATE DATABASE IF NOT EXISTS etudiants_db;

USE etudiants_db;

CREATE TABLE IF NOT EXISTS etudiant (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    prenom VARCHAR(50),
    email VARCHAR(100)
);

INSERT INTO etudiant (nom, prenom, email) VALUES
('Daaif', 'Achraf', 'ad@univ.ma'),
('Marimi', 'Jamila', 'jam@univ.ma'),
('Bodan', 'Lahcen', 'luc@univ.ma');


CREATE TABLE IF NOT EXISTS classe (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    niveau VARCHAR(50)
);

INSERT INTO classe (nom, niveau) VALUES
('Mathematiques', 'Licence 1'),
('Physique', 'Licence 2'),
('Informatique', 'Licence 3');