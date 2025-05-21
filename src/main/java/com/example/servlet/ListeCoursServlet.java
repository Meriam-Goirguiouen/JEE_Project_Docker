package com.example.servlet;

import com.example.dao.CoursDAO;
import com.example.model.Cours;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListeCoursServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        CoursDAO dao = new CoursDAO();
        List<Cours> cours = dao.getAll();
        req.setAttribute("cours", cours);
        req.getRequestDispatcher("cours.jsp").forward(req, res);
    }
}
