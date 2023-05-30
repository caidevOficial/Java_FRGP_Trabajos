package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Segurodao;
import entidad.Seguro;

/**
 * Servlet implementation class ServletSeguro
 */
@WebServlet("/ServletSeguro")
public class ServletSeguro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSeguro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		if(request.getParameter("BtnAgregarSeguro") != null) 
		{
			
			Seguro seguro = new Seguro();
			Segurodao SDao = new Segurodao();
			
			boolean SeAgrego = false;
			
			try {
				seguro.setDescripcion(request.getParameter("Descrip"));
				seguro.setTipo(Integer.parseInt(request.getParameter("Tipo")));
				seguro.setCosContra(Float.parseFloat(request.getParameter("CostoCont")));
				seguro.setCosAseg(Float.parseFloat(request.getParameter("CostoAseg")));	
			} catch (Exception e) {
								
				request.setAttribute("DatosIncorrecots", true);
				
				RequestDispatcher rd = request.getRequestDispatcher("/AgregarSeguro.jsp");
				rd.forward(request, response);
			}
			
			
//			seguro.setId(nuevoSeg);
			
		
			SeAgrego = SDao.AgregarSeguro(seguro);
			
			request.setAttribute("SeguroAgregado", SeAgrego);
			
			RequestDispatcher rd = request.getRequestDispatcher("/AgregarSeguro.jsp");
			rd.forward(request, response);
		}
		
		
		
		if(request.getParameter("BtnFiltrar") != null)
		{
			String WHERE = "WHERE IdTipo = ";
			switch (request.getParameter("FiltroTipo")) { 
		    case "Seguro de casas":
		    	WHERE = WHERE + "1";
		     // secuencia de sentencias.
		     break;
		    case "Seguro de vida":
		    	WHERE = WHERE + "2";
		     // secuencia de sentencias.
		     break;
		     
		    case "Seguro de motos":
		    	WHERE = WHERE + "3";
		     // secuencia de sentencias.
		     break;
		    default:
		    	WHERE = "";
		     
		  }
			Segurodao SDao = new Segurodao();
			ArrayList<Seguro> ListaSeguros= SDao.readAll(WHERE);
			
			request.setAttribute("ListaSeguros", ListaSeguros);
			
			RequestDispatcher rd = request.getRequestDispatcher("/ListarSeguros.jsp");
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
