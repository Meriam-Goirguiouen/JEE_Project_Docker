package com.example.model;

public class Cours {
	private int id;
    private String nom;
    private String matiere_id;
    private String professeur_id;
	public String getNom() {
		return nom;
	}
	
	public Cours() {
	}


	public Cours(int id, String nom, String matiere_id, String professeur_id) {
		this.id = id;
		this.nom = nom;
		this.matiere_id = matiere_id;
		this.professeur_id = professeur_id;
	}
	
	// getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMatiere_id() {
		return matiere_id;
	}
	public void setMatiere_id(String matiere_id) {
		this.matiere_id = matiere_id;
	}
	public String getProfesseur_id() {
		return professeur_id;
	}
	public void setProfesseur_id(String professeur_id) {
		this.professeur_id = professeur_id;
	}



    
    
}
