package com.example.dao;

import com.example.model.Classe;
import java.sql.*;
import java.util.*;

public class ClasseDAO {
    private String jdbcURL = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "root";

    public List<Classe> getAll() {
        List<Classe> liste = new ArrayList<>();
        try {
            // Chargement explicite du driver JDBC MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM classe")) {

                while (rs.next()) {
                    Classe c = new Classe();
                    c.setId(rs.getInt("id"));
                    c.setNom(rs.getString("nom"));
                    c.setNiveau(rs.getString("niveau"));
                    liste.add(c);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }
}
