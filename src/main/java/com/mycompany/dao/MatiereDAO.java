package com.mycompany.dao;

import com.mycompany.model.Matiere;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MatiereDAO {
    private String jdbcURL = "jdbc:mysql://mysql_etudiants:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "";

    public List<Matiere> getAll() {
        List<Matiere> liste = new ArrayList<>();
        String query = "SELECT * FROM matiere";

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

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return liste;
    }
}
