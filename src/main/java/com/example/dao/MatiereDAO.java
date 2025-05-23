package com.example.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Matiere;

public class MatiereDAO {
    private String jdbcURL = "jdbc:mysql://mysql_etudiants:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "ufxjX & 0912";

    public List<Matiere> getAll() {
        List<Matiere> liste = new ArrayList<>();
        String query = "SELECT * FROM matiere";
             try {
            // Chargement explicite du driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Matiere m = new Matiere();
                m.setId(rs.getInt("id"));
                m.setNom(rs.getString("nom"));
                m.setDescription(rs.getString("description"));
                liste.add(m);
            }

        } }catch (Exception e) {
            e.printStackTrace();
        }

        return liste;
    }
}