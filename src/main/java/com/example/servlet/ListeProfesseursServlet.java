package com.example.servlet;

import com.example.dao.ProfesseurDAO;
import com.example.model.Professeur;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListeProfesseursServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ProfesseurDAO dao = new ProfesseurDAO();
        List<Professeur> professeurs = dao.getAll();
        req.setAttribute("professeurs", professeurs);
        req.getRequestDispatcher("liste.jsp").forward(req, res);
    }
}
