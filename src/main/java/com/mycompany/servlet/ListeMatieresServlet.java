package com.mycompany.servlet;

import com.mycompany.dao.MatiereDAO;
import com.mycompany.model.Matiere;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListeMatieresServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    MatiereDAO dao = new MatiereDAO();
    List<Matiere> matieres = dao.getAll();
    req.setAttribute("matieres", matieres);
    req.getRequestDispatcher("listeMatieres.jsp").forward(req, res);
    
}

}