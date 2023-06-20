package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.mysql.cj.Session;

import Entidad.Usuario;
import dao.Usuariodao;

/**
 * Servlet implementation class ServletSeguro
 */
@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
		
		if(request.getParameter("btn_Login") != null) {
			
			Usuario user = new Usuario();
			Usuariodao UDao = new Usuariodao();
			
			
			
			if (request.getParameter("User") != null && request.getParameter("password") != null) {
				try {
					user = UDao.GetSingle(request.getParameter("User"), request.getParameter("password"));					
				
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}
			
			if(user.getDNI() != null) {
				
				request.getSession().setAttribute("Usuario", user);
				
				if (user.isAdministrador()){
					RequestDispatcher rd  = request.getRequestDispatcher("/GestionAdmin.jsp");
					rd.forward(request, response);
				}else{
					RequestDispatcher rd  = request.getRequestDispatcher("/Medico.jsp");
					rd.forward(request, response);
				}
			}
			
			RequestDispatcher rd  = request.getRequestDispatcher("/Error.jsp");						
			rd.forward(request, response);
		}
		
	}

}
