package ar.edu.utn.frro.java.web.cwa.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // does not change current path
        request.setAttribute("pageTitle", "Login");
        request.setAttribute("welcomeMessage","Ingrese su usuario y contraseña");
        getServletContext().getRequestDispatcher("/WEB-INF/pages/public/login.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String password = request.getParameter("password");
        if (user.equals("admin") && password.equals("admin")) {
            // redirects creating a new request
            response.sendRedirect("home");
        } else {
            request.setAttribute("errorMessage", "Credenciales Incorrectas");
            doGet(request, response);
        }
    }

}
