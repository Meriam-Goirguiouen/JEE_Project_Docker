package com.example.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.example.model.Cours;

public class CoursDAO {
	private String jdbcURL = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "ufxjX & 0912";

    public List<Cours> getAll() {
        List<Cours> liste = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM cours")) {
            while (rs.next()) {
                Cours e = new Cours();
                e.setId(rs.getInt("id"));
                e.setNom(rs.getString("nom"));
                e.setMatiere_id(rs.getString("matiere_id"));
                e.setProfesseur_id(rs.getString("professeur_id"));
                liste.add(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }
}
