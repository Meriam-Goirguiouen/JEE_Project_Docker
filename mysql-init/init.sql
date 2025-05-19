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
