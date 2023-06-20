package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidad.Usuario;
import dao.Conexion;


/**
 * The Usuariodao class retrieves a single user from a database based on their email and password and
 * returns a new User object.
 */
public class Usuariodao {

	 
	/**
	 * This function retrieves a single user from a database based on their email and password.
	 * 
	 * @param Email A string representing the email of the user to be retrieved from the database.
	 * @param Contrase It seems like the parameter "Contraseña" is a string variable that represents the
	 * password of a user. It is used in the SQL query to retrieve a user from the database based on their
	 * email and password.
	 * @return The method is returning a single instance of the class Usuario that matches the given email
	 * and password.
	 */
	public Usuario GetSingle(String Email, String Contrase�a) {
		
		PreparedStatement statement;
		ResultSet resultSet; 
		Usuario user = new Usuario();
		Conexion conexion = Conexion.getConexion();
		
		try {
			statement = conexion.getSQLConexion().prepareStatement("SELECT * FROM USUARIOS WHERE Email = '"+ Email + "' AND Contrase�a = '" + Contrase�a + "'");
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				user = getUsuario(resultSet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}


	/**
	 * The function retrieves user information from a ResultSet and returns a new User object.
	 * 
	 * @param resultSet A ResultSet object that contains the data retrieved from a database after
	 * executing a SQL query. It represents a table of data resulting from a database query.
	 * @return A new instance of the class Usuario with the values obtained from the ResultSet.
	 */
	private Usuario getUsuario(ResultSet resultSet) throws SQLException {
		String DNI = resultSet.getString("DNI");
		String Nombre = resultSet.getString("Nombre");
		String Apellido = resultSet.getString("Apellido");
		String Contrase�a = resultSet.getString("Contrase�a");
		String Email = resultSet.getString("Email");
		boolean Administrador = resultSet.getBoolean("Administrador"); 
		
		return new Usuario(DNI,Nombre,Apellido,Contrase�a, Email, Administrador);
	}
	
}
