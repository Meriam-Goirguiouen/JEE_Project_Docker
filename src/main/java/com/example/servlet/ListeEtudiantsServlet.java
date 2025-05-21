<<<<<<< HEAD
package com.example.servlet;

import com.example.dao.EtudiantDAO;
import com.example.model.Etudiant;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListeEtudiantsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        EtudiantDAO dao = new EtudiantDAO();
        List<Etudiant> etudiants = dao.getAll();
        req.setAttribute("etudiants", etudiants);
        req.getRequestDispatcher("liste.jsp").forward(req, res);
    }
}
=======
package com.mycompany.servlet; 
 
import com.mycompany.dao.EtudiantDAO; 
import com.mycompany.model.Etudiant; 
import jakarta.servlet.*; 
import jakarta.servlet.http.*; 
import java.io.IOException; 
import java.util.List; 
 
public class ListeEtudiantsServlet extends HttpServlet { 
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
throws ServletException, IOException { 
        EtudiantDAO dao = new EtudiantDAO(); 
        List<Etudiant> etudiants = dao.getAll(); 
        req.setAttribute("etudiants", etudiants); 
        req.getRequestDispatcher("liste.jsp").forward(req, res); 
    } 
} 
>>>>>>> Table_Matiere
