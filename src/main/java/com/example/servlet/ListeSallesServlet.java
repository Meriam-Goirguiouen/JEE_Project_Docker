package com.example.servlet;

import com.example.dao.SalleDAO;
import com.example.model.Salle;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListeSallesServlet extends HttpServlet{
      protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        SalleDAO dao = new SalleDAO();
        List<Salle> salles = dao.getAllSalles();
        req.setAttribute("salles", salles);
        req.getRequestDispatcher("SalleListe.jsp").forward(req, res);
    }
}
