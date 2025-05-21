package com.example.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

import com.example.dao.MatiereDAO;
import com.example.model.Matiere;

public class ListeMatieresServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    MatiereDAO dao = new MatiereDAO();
    List<Matiere> matieres = dao.getAll();
    req.setAttribute("matieres", matieres);
    req.getRequestDispatcher("listeMatieres.jsp").forward(req, res);
    
}

}