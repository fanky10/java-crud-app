package ar.edu.utn.frro.java.web.cwa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BicicletasServlet
 */
public class BicicletasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BicicletasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<String> bicicletas = new ArrayList<String>();
		bicicletas.add("Bici 1");
		bicicletas.add("Bici 2");
		bicicletas.add("Bici 3");
		bicicletas.add("Bici 4");
		bicicletas.add("Bici 5");
		request.setAttribute("bicicletasList", bicicletas);
		getServletContext().getRequestDispatcher("/WEB-INF/pages/bicicletas.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
