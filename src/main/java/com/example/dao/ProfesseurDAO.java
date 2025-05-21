package com.example.dao;

import com.example.model.Professeur;
import java.sql.*;
import java.util.*;

public class ProfesseurDAO {
    private String jdbcURL = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "ufxjX & 0912";

    public List<Professeur> getAll() {
        List<Professeur> liste = new ArrayList<>();
         try {
            // Chargement explicite du driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM professeur")) {

            while (rs.next()) {
                Professeur e = new Professeur();
                e.setId(rs.getInt("id"));
                e.setNom(rs.getString("nom"));
                e.setPrenom(rs.getString("prenom"));
                e.setEmail(rs.getString("email"));
                liste.add(e);
            }
        } }catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }
}
