package com.example.dao;

import com.example.model.Salle;
import java.sql.*;
import java.util.*;

public class SalleDAO {
    private String jdbcURL = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "ufxjX & 0912";

    public List<Salle>getAllSalles(){
        List<Salle> liste = new ArrayList<>();
        try {
            // Chargement explicite du driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Salle"))
            {
                while(rs.next()){
                    Salle salle = new Salle();
                    salle.setIdSalle(rs.getInt("id_salle"));
                    salle.setNomSalle(rs.getString("nom_salle"));
                    salle.setCapacite(rs.getInt("capacite"));
                    salle.setType(rs.getString("type_salle"));
                    salle.setBatiment(rs.getString("batiment"));
                    liste.add(salle); 
                }
            }}catch(Exception e){
            e.printStackTrace();
                                }
        return liste;
    }
}
