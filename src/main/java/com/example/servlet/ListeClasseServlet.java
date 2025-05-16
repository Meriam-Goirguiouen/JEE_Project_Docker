package com.example.servlet;

import com.example.dao.ClasseDAO;
import com.example.model.Classe;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListeClasseServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ClasseDAO dao = new ClasseDAO();
        List<Classe> classes = dao.getAll();
        req.setAttribute("classes", classes);
        req.getRequestDispatcher("listeClasses.jsp").forward(req, res);
    }
}
