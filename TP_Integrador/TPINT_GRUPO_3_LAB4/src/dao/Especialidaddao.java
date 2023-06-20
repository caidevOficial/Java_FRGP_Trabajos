package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidad.Especialidad;

/**
 * The Especialidaddao class contains methods for retrieving and returning data related to Especialidad
 * objects from a database.
 */
public class Especialidaddao {
	
	/**
	 * This Java function retrieves a single record from a database table called "ESPECIALIDAD" based on a
	 * given description.
	 * 
	 * @param Descripcion a String variable representing the description of an Especialidad (specialty)
	 * that is being searched for in the database.
	 * @return The method is returning an object of type Especialidad.
	 */
	public Especialidad GetSingle(String Descripcion) {
			
			PreparedStatement statement;
			ResultSet resultSet; 
			Especialidad Espe = new Especialidad();
			Conexion conexion = Conexion.getConexion();
			
			try {
				statement = conexion.getSQLConexion().prepareStatement(String.format("SELECT * FROM ESPECIALIDAD WHERE DESCRIPCION = %s", Descripcion));
				resultSet = statement.executeQuery();
				while(resultSet.next()) {
					Espe = getEspecialidad(resultSet);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return Espe;
		}

	/**
	 * This function reads all the records from the ESPECIALIDAD table and returns them as an ArrayList of
	 * Especialidad objects.
	 * 
	 * @return An ArrayList of objects of type Especialidad, which contains all the records from the
	 * ESPECIALIDAD table in the database.
	 */
	public ArrayList<Especialidad> readAll() {
		
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<Especialidad> ListEspecialidad = new ArrayList<Especialidad>();
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement("SELECT * FROM ESPECIALIDAD;");
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				ListEspecialidad.add(getEspecialidad(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return ListEspecialidad;
		
		
	}

	/**
	 * The function retrieves an Especialidad object from a ResultSet containing its Id and Descripcion.
	 * 
	 * @param resultSet A ResultSet object that contains the data retrieved from a database after
	 * executing a SQL query. It represents a table of data resulting from a database query.
	 * @return A new instance of the class Especialidad with the values of Id and Descripcion obtained
	 * from the ResultSet.
	 */
	private Especialidad getEspecialidad(ResultSet resultSet) throws SQLException {
		int Id = resultSet.getInt("Id");
		String Descripcion = resultSet.getString("Descripcion");
		
		return new Especialidad(Id,Descripcion);
	}
}
