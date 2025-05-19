package com.example.dao;

import com.example.model.Note;
import java.sql.*;
import java.util.*;

public class NoteDAO {
    private String url = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String username = "root";
    private String password = "ufxjX & 0912";

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }

    public List<Note> getAllNotes() {
        List<Note> notes = new ArrayList<>();
        String sql = "SELECT * FROM notes";

        try (Connection connection = getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Note note = new Note();
                note.setId(rs.getString("id"));
                note.setEtudiantId(rs.getString("etudiant_id"));
                note.setMatiereId(rs.getString("matiere_id"));
                note.setValeur(rs.getFloat("valeur"));
                note.setDateAttribution(rs.getDate("date_attribution"));
                System.out.println("Fetched note: " + note.getId());
                notes.add(note);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        return notes;
    }
}





  /*  public void addNote(Note note) throws SQLException {
        String sql = "INSERT INTO notes (id, etudiant_id, matiere_id, valeur, date_attribution) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, note.getId());
            stmt.setString(2, note.getEtudiantId());
            stmt.setString(3, note.getMatiereId());
            stmt.setFloat(4, note.getValeur());
            stmt.setDate(5, note.getDateAttribution());
            stmt.executeUpdate();
        }
    }

    public void deleteNote(String id) throws SQLException {
        String sql = "DELETE FROM notes WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
        }
    }

    public Note getNoteById(String id) throws SQLException {
        String sql = "SELECT * FROM notes WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Note(
                        rs.getString("id"),
                        rs.getString("etudiant_id"),
                        rs.getString("matiere_id"),
                        rs.getFloat("valeur"),
                        rs.getDate("date_attribution")
                    );
                }
            }
        }
        return null;
    }

    public void updateNote(Note note) throws SQLException {
        String sql = "UPDATE notes SET etudiant_id = ?, matiere_id = ?, valeur = ?, date_attribution = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, note.getEtudiantId());
            stmt.setString(2, note.getMatiereId());
            stmt.setFloat(3, note.getValeur());
            stmt.setDate(4, note.getDateAttribution());
            stmt.setString(5, note.getId());
            stmt.executeUpdate();
        }
    }
}
}
*/