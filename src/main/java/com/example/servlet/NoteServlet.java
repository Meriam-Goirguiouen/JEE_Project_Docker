package com.example.servlet;

import com.example.dao.NoteDAO;
import com.example.model.Note;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class NoteServlet extends HttpServlet {

    private NoteDAO noteDAO = new NoteDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<Note> notes = noteDAO.getAllNotes();
        req.setAttribute("notes", notes);
        req.getRequestDispatcher("/notes.jsp").forward(req, res);
    }
}


    // @Override
    // protected void doPost(HttpServletRequest request, HttpServletResponse response)
    //         throws ServletException, IOException {
    //     int idEtudiant = Integer.parseInt(request.getParameter("idEtudiant"));
    //     int idModule = Integer.parseInt(request.getParameter("idModule"));
    //     float valeur = (float) Double.parseDouble(request.getParameter("note"));

    //     // ✅ Date actuelle (java.sql.Date)
    //     Date dateAttribution = new Date(System.currentTimeMillis());

    //     Note note = new Note();
    //     note.setEtudiantId(String.valueOf(idEtudiant));
    //     note.setMatiereId(String.valueOf(idModule));
    //     note.setValeur(valeur);
    //     note.setDateAttribution(dateAttribution);

    //     try {
    //         noteDAO.addNote(note);
    //     } catch (SQLException e) {
    //         throw new ServletException(e);
    //     }

    //     response.sendRedirect("notes.jsp");
    // }

//}
