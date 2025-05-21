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

CREATE TABLE matieres (
    id VARCHAR(50) PRIMARY KEY,
    nom VARCHAR(100) NOT NULL
);

INSERT INTO matieres (id, nom) VALUES
('M1', 'Maths'),
('M2', 'Physique'),
('M3', 'Informatique');

CREATE TABLE notes (
    id VARCHAR(50) PRIMARY KEY,
    etudiant_id VARCHAR(50),
    matiere_id VARCHAR(50),
    valeur FLOAT,
    date_attribution DATE
    -- FOREIGN KEY (etudiant_id) REFERENCES etudiants(id)
    -- FOREIGN KEY (matiere_id) REFERENCES matieres(id)
);
-- ALTER TABLE notes
-- ADD CONSTRAINT fk_matiere
-- FOREIGN KEY (matiere_id) REFERENCES matieres(id);


INSERT INTO notes (id, etudiant_id, matiere_id, valeur, date_attribution) VALUES
('N1', 'E1', 'M1', 15.5, '2024-11-10'),
('N2', 'E2', 'M2', 12.0, '2024-11-11'),
('N3', 'E3', 'M1', 17.0, '2024-11-12'),
('N4', 'E1', 'M3', 14.25, '2024-11-15'),
('N5', 'E2', 'M1', 10.0, '2024-11-16');

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
('Amphi 4', '150', 'classe', 'scientifique');
