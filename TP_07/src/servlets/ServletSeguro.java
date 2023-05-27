package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Segurodao;
import entidad.Seguro;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

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
		Segurodao segdao = new Segurodao();
		int nuevoSeg = segdao.NuevoId();
		
		if(request.getParameter("BtnAgregarSeguro")!= null) 
		{
			
			Seguro seguro = new Seguro();
			Segurodao SDao = new Segurodao();
			
			seguro.setId(nuevoSeg);
			seguro.setDescripcion(request.getParameter("Descrip"));
			seguro.setTipo(Integer.parseInt(request.getParameter("Tipo")));
			seguro.setCosContra(Float.parseFloat(request.getParameter("CostoCont")));
			seguro.setCosAseg(Float.parseFloat(request.getParameter("CostoAseg")));
			
			SDao.AgregarSeguro(seguro);
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
