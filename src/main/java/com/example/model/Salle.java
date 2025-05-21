package com.example.model;
public class Salle {
    private int id_salle;
    private String nom_salle;
    private int capacite;
    private String type_salle;
    private String batiment;
    // Constructors 
    public Salle(){ }
    public Salle(int id_salle,String nom_salle, int capacite, String type_salle, String batiment){
        this.id_salle = id_salle;
        this.nom_salle = nom_salle;
        this.capacite = capacite;
        this.type_salle = type_salle;
        this.batiment = batiment;
    }
    // Getters & Setters
    public int getIdSalle(){
        return this.id_salle;
    }
    public String getNomSalle(){
        return this.nom_salle;
    }
    public int getCapacite(){
        return this.capacite;
    }
    public String getType(){
        return this.type_salle;
    }
    public String getBatiment(){
        return this.batiment;
    }
    public void setIdSalle(int id){
        this.id_salle = id;
    }
    public void setNomSalle(String nom){
        this.nom_salle = nom;
    }
    public void setCapacite(int capacite){
        this.capacite = capacite;
    }
    public void setType(String type){
        this.type_salle = type;
    }
    public void setBatiment(String batiment){
        this.batiment = batiment;
    }
}


