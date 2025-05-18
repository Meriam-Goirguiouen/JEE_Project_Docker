CREATE DATABASE IF NOT EXISTS etudiants_db; 

USE etudiants_db; 

-- Table Etudiant
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

-- Table Matière
CREATE TABLE IF NOT EXISTS matiere ( 
    id INT PRIMARY KEY AUTO_INCREMENT, 
    nom VARCHAR(100), 
    description TEXT
); 

INSERT INTO matiere (nom, description) VALUES 
('Mathématiques', 'Analyse, Algèbre et Géométrie'), 
('Informatique', 'Programmation, Réseaux, Base de données'), 
('Physique', 'Mécanique, Électricité, Optique');
