package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entidad.Paciente;
import dao.Generaldao;

/**
 * Servlet implementation class ServletGeneral
 */
@WebServlet("/ServletGeneral")
public class ServletGeneral extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGeneral() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("ListarProvincias") != null)
		{ 
			Generaldao SDao = new Generaldao();
			ArrayList<String> ListaProvincia = SDao.readProvinciasXPais(request.getParameter("Pais"));
			
			request.setAttribute("ListaProvincia", ListaProvincia);
			
			StringBuilder options = new StringBuilder();
	        for (String provincia : ListaProvincia) {
	            options.append("<option value=\"" + provincia +  "</option>");
	        }
			       
			
			 response.setContentType("text/html");
		        PrintWriter out = response.getWriter();
		        out.print(options.toString());
		}
		
		if(request.getParameter("ListarPais") != null)
		{ 
			Generaldao SDao = new Generaldao();
			ArrayList<String> ListarPais = SDao.readAllPais();
			
			request.setAttribute("ListaPais", ListarPais);
			
			RequestDispatcher rd = request.getRequestDispatcher("/Paciente.jsp");
			rd.forward(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
