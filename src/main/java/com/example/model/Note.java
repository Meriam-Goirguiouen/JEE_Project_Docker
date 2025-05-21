package com.example.model;



public class Note {
    private String id;
    private String etudiantId;
    private String matiereId;
    private float valeur;
    private java.sql.Date dateAttribution;

    public Note(){}

    // Constructor
    public Note(String id, String etudiantId, String matiereId, float valeur, java.sql.Date dateAttribution) {
        this.id = id;
        this.etudiantId = etudiantId;
        this.matiereId = matiereId;
        this.valeur = valeur;
        this.dateAttribution = dateAttribution;
    }

    // Getters and Setters
    public String getId() { 
        return id; 
        }
    public void setId(String id) { 
        this.id = id; 
        }

    public String getEtudiantId() { 
        return etudiantId; 
        }
    public void setEtudiantId(String etudiantId) { 
        this.etudiantId = etudiantId; 
        }

    public String getMatiereId() { 
        return matiereId; 
        }
    public void setMatiereId(String matiereId) { 
        this.matiereId = matiereId; 
        }

    public float getValeur() { 
        return valeur; 
        }
    public void setValeur(float valeur) { 
        this.valeur = valeur; 
        }

    public java.sql.Date getDateAttribution() { 
        return dateAttribution; }

    public void setDateAttribution(java.sql.Date dateAttribution) { 
        this.dateAttribution = dateAttribution; 
        }
}
