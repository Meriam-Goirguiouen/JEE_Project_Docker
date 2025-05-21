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

-- Table : Salle
CREATE TABLE Salle (
    id_salle INT PRIMARY KEY AUTO_INCREMENT,
    nom_salle VARCHAR(50),
    capacite INT(3),
    type_salle VARCHAR(50),
    batiment VARCHAR(50)
);

INSERT INTO Salle (nom_salle, capacite,type_salle,batiment) VALUES
('AS1', '60', 'classe', 'informatique'),
('AS2', '70', 'classe', 'informatique'),
('AS3', '60', 'travaux pratiques', 'informatique'),
('AS4', '0', 'classe', 'mathématiques'),
('Amphi 4', '150', 'classe', 'scientifique');

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