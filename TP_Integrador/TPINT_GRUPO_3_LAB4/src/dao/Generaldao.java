package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entidad.Especialidad;

/**
 * The Generaldao class contains methods to retrieve a list of provinces for a given country and a list
 * of all countries.
 */
public class Generaldao {
	
	/**
	 * This Java function reads and returns a list of distinct province descriptions for a given country.
	 * 
	 * @param Pais The name of the country for which you want to retrieve the list of provinces.
	 * @return An ArrayList of Strings containing the names of provinces in a given country.
	 */
	public ArrayList<String> readProvinciasXPais(String Pais) {
		
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<String> ListaProvincia = new ArrayList<String>();
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(
				"SELECT DISTINCT provincia.Descripcion FROM pais " + 
				"INNER JOIN provincia ON provincia.Id_Pais = (SELECT p.Id FROM pais AS p WHERE p.Descripcion = '"+Pais+"');");
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				ListaProvincia.add(getProvincia(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return ListaProvincia;	
	}
	
	/**
	 * This Java function retrieves a list of all countries from a database and returns them as an
	 * ArrayList of strings.
	 * 
	 * @return An ArrayList of Strings containing the descriptions of all the countries in the "pais"
	 * table of the database.
	 */
	public ArrayList<String> readAllPais() {
		
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<String> ListaProvincia = new ArrayList<String>();
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement("SELECT Descripcion FROM pais");
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				ListaProvincia.add(getPais(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return ListaProvincia;	
	}
	
	/**
	 * This Java function retrieves the "Descripcion" value from a ResultSet object and returns it as a
	 * String.
	 * 
	 * @param resultSet A ResultSet object that contains the results of a database query. The method is
	 * extracting the value of the "Descripcion" column from the current row of the ResultSet and
	 * returning it as a String.
	 * @return The method is returning a String value which is the "Descripcion" column value from the
	 * ResultSet object passed as a parameter.
	 */
	private String getProvincia(ResultSet resultSet) throws SQLException {
		
		String Descripcion = resultSet.getString("Descripcion");
		
		return Descripcion;
	}
	
	/**
	 * This Java function retrieves the "Descripcion" value from a ResultSet object and returns it as a
	 * String.
	 * 
	 * @param resultSet A ResultSet object that contains the results of a database query. The method is
	 * extracting the value of the "Descripcion" column from the current row of the ResultSet and
	 * returning it as a String.
	 * @return The method `getPais` is returning a `String` value which is the value of the column
	 * "Descripcion" from the `ResultSet` object passed as a parameter.
	 */
	private String getPais(ResultSet resultSet) throws SQLException {
		
		String Descripcion = resultSet.getString("Descripcion");
		
		return Descripcion;
	}
}
