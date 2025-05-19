CREATE DATABASE IF NOT EXISTS etudiants_db;

USE etudiants_db;

CREATE TABLE etudiant (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    prenom VARCHAR(50),
    email VARCHAR(100)
);

INSERT INTO etudiant (nom, prenom, email) VALUES
('Daaif', 'Achraf', 'ad@univ.ma'),
('Marimi', 'Jamila', 'jam@univ.ma'),
('Bodan', 'Lahcen', 'luc@univ.ma');


CREATE TABLE cours (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    matiere_id VARCHAR(50),
    professeur_id VARCHAR(100)
);

INSERT INTO cours (nom, matiere_id, professeur_id) VALUES
('Anglais', 1, 1),
('Informatique', 2, 1),
('Musique', 3, 2);

