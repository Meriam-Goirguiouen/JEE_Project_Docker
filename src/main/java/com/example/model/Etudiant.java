<<<<<<< HEAD
package com.example.model;

public class Etudiant {

=======
package com.mycompany.model;

public class Etudiant {
>>>>>>> Table_Matiere
    private int id;
    private String nom;
    private String prenom;
    private String email;

<<<<<<< HEAD
    // Constructor without parameters
    public Etudiant() {
    }

    // Constructor with all fields
=======
    
    public Etudiant() {
    }

    
>>>>>>> Table_Matiere
    public Etudiant(int id, String nom, String prenom, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

<<<<<<< HEAD
    // Getters and Setters

=======
    // Getters
>>>>>>> Table_Matiere
    public int getId() {
        return id;
    }

<<<<<<< HEAD
    public void setId(int id) {
        this.id = id;
    }

=======
>>>>>>> Table_Matiere
    public String getNom() {
        return nom;
    }

<<<<<<< HEAD
    public void setNom(String nom) {
        this.nom = nom;
    }

=======
>>>>>>> Table_Matiere
    public String getPrenom() {
        return prenom;
    }

<<<<<<< HEAD
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

=======
>>>>>>> Table_Matiere
    public String getEmail() {
        return email;
    }

<<<<<<< HEAD
=======
    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

>>>>>>> Table_Matiere
    public void setEmail(String email) {
        this.email = email;
    }
}
