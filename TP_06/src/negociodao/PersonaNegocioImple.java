package negociodao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

import entidad.Persona;
import negocio.IPersonaNegocio;

public class PersonaNegocioImple implements IPersonaNegocio {

	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "3r1c5d9";
	private String dbName = "bdpersonas";
	
	
	@Override
	public boolean AgregarPersona(Persona Perso) {
		
		String query = "Insert into personas(dni, nombre, apellido) values ('" + Perso.getDni() + "','" + Perso.getNombre() + "','" + Perso.getApellido() + "')";

		Connection cn = null;
		
		try {
			cn = DriverManager.getConnection(host+dbName,user,pass);
			java.sql.Statement st =  cn.createStatement();
			int Filas = st.executeUpdate(query);
			if (Filas == 1)
			{
				return true;				
			}else
			{
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return false;
	}

	@Override
	public boolean ExistePersona(String dni) {
		

		Connection cn = null;
		
		try {
			cn = DriverManager.getConnection(host+dbName,user,pass);
			java.sql.Statement st =  cn.createStatement();
			String query = "SELECT dni FROM personas WHERE dni ='" + dni + "'";
			ResultSet rs = st.executeQuery(query);
			if (rs.next())
			{
				// DEVUELVO QUE EXISTE
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		// NO EXISTE
		return false;

	}

	
}
