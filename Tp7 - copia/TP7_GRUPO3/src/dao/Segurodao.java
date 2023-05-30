package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidad.Seguro;
import dao.Conexion;


/**
 * The Segurodao class contains methods for adding, retrieving, and updating Seguro objects in a
 * database.
 */
public class Segurodao {

	/**
	 * This Java function adds a new insurance policy to a database table.
	 * 
	 * @param Seg an object of the class Seguro, which contains information about a type of insurance
	 * policy.
	 * @return The method is returning a boolean value indicating whether the insertion of a new "Seguro"
	 * object into the database was successful or not.
	 */
	public boolean AgregarSeguro(Seguro Seg) {
		
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean isInsertExitoso = false;
		
		try {
			statement = conexion.prepareStatement("INSERT INTO seguros(Descripcion, idTipo, costoContratacion, costoAsegurado) VALUES (?, ?, ?, ?)");
			//Esto se lo comente ya que la base crea el ID de manera autonumerica
			//statement.setInt(1, Seg.getId());
			statement.setString(1, Seg.getDescripcion());
			statement.setInt(2, Seg.getTipo());
			statement.setFloat(3, Seg.getCosContra());
			statement.setFloat(4, Seg.getCosAseg());
			if(statement.executeUpdate() > 0)
			{
				conexion.commit();
				isInsertExitoso = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conexion.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		return isInsertExitoso;				
	}

	/**
	 * The function returns a new ID for a table by selecting the maximum ID from the table and adding 1.
	 * 
	 * @return The method returns an integer value, which is the new ID for a record in the "Seguros"
	 * table.
	 */
	public int NuevoId() {
		PreparedStatement statement;
		ResultSet resultSet; 
		int Nuevoid = 1;
		Conexion conexion = Conexion.getConexion();
		try {
			statement = conexion.getSQLConexion().prepareStatement("SELECT MAX(idSeguro + 1) AS NuevoId FROM Seguros");
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Nuevoid = resultSet.getInt("NuevoId");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Nuevoid;
	}
	
	/**
	 * This Java function reads all Seguro objects from a database table based on a given condition.
	 * 
	 * @param Where A string parameter that represents the WHERE clause of the SQL query. It is used to
	 * filter the results of the query based on certain conditions.
	 * @return A List of Seguro objects.
	 */
	public List<Seguro> readAll(String Where) {
			PreparedStatement statement;
			ResultSet resultSet; 
			ArrayList<Seguro> personas = new ArrayList<Seguro>();
			Conexion conexion = Conexion.getConexion();
			try {
				statement = conexion.getSQLConexion().prepareStatement("SELECT idSeguro, descripcion, idTipo, costoContratacion,costoAsegurado FROM Seguros " + Where);
				resultSet = statement.executeQuery();
				while(resultSet.next()) {
					personas.add(getSeguro(resultSet));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return personas;
		}

	/**
	 * This Java function reads all the records from a table named "Seguros" and returns them as a list of
	 * objects of type "Seguro".
	 * 
	 * @return A list of Seguro objects.
	 */
	public List<Seguro> readAll() {
		
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<Seguro> personas = new ArrayList<Seguro>();
		Conexion conexion = Conexion.getConexion();
		try {
			statement = conexion.getSQLConexion().prepareStatement("SELECT idSeguro, descripcion, idTipo, costoContratacion,costoAsegurado FROM Seguros ");
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				personas.add(getSeguro(resultSet));
			}
		} Catch (SQLException e) {
			e.printStackTrace();
		}
		return personas;
	}

	/**
	 * The function retrieves data from a ResultSet and creates a new Seguro object with the retrieved
	 * data.
	 * 
	 * @param resultSet A ResultSet object that contains the data retrieved from a database after
	 * executing a SQL query.
	 * @return A Seguro object is being returned.
	 */
	private Seguro getSeguro(ResultSet resultSet) throws SQLException {
		int id = resultSet.getInt("idSeguro");
		String Descripcion = resultSet.getString("descripcion");
		int idTipo = resultSet.getInt("idTipo"); 
		float CostoCon =  resultSet.getFloat("costoContratacion");
		float CostoAseg= resultSet.getFloat("costoAsegurado");
		return new Seguro(id, Descripcion, idTipo, CostoCon, CostoAseg);
	}
	
}
