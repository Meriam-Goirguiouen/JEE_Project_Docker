package com.example.servlet;

import com.example.dao.ClasseDAO;
import com.example.model.Classe;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.List;

public class ListeClasseServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ClasseDAO dao = new ClasseDAO();
        List<Classe> classes = dao.getAll();

        System.out.println("Nombre de classes envoyées à la JSP : " + classes.size());

        req.setAttribute("classes", classes);
        req.getRequestDispatcher("listeClasses.jsp").forward(req, res);
    }
}
