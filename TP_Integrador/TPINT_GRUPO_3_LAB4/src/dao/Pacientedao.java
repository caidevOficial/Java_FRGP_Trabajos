package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entidad.Especialidad;
import Entidad.Paciente;

/**
 * The Pacientedao class retrieves patient information from a database and returns it as a Paciente
 * object or an ArrayList of Paciente objects.
 */
public class Pacientedao {
	
	/**
	 * This function retrieves a single patient's information from a database based on their DNI
	 * (identification number).
	 * 
	 * @param _Dni The parameter "_Dni" is a String that represents the DNI (Documento Nacional de
	 * Identidad) of a patient. It is used to retrieve information about a single patient from the
	 * database.
	 * @return The method is returning a single instance of the Paciente class, which contains information
	 * about a patient, based on their DNI (identification number).
	 */
	public Paciente GetSingle(String _Dni) {
		
		PreparedStatement statement;
		ResultSet resultSet; 
		Paciente paciente = new Paciente();
		Conexion conexion = Conexion.getConexion();
		
		try {
			statement = conexion.getSQLConexion().prepareStatement("SELECT USU.Nombre, USU.Apellido,P.Sexo,pais.Descripcion AS Nacionalidad,P.FechaNac, P.Direccion, Loc.Descripcion AS Localidad ,USU.Email, P.Telefono FROM paciente AS P " + 
					"INNER JOIN usuarios AS USU on P.DNI = USU.DNI " + 
					"INNER JOIN pais on P.Id_Nacionalidad = pais.Id " + 
					"INNER JOIN localidad AS Loc on P.ID_localidad = Loc.Id " + 
					"WHERE P.DNI = "+ _Dni);
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				paciente = getPaciente(resultSet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return paciente;
	}

	/**
	 * This function retrieves patient information from a ResultSet and returns a Paciente object.
	 * 
	 * @param resultSet A ResultSet object that contains the data retrieved from a database after executing
	 * a SQL query.
	 * @return The method `getPaciente` is returning an instance of the `Paciente` class.
	 */
	private Paciente getPaciente(ResultSet resultSet) throws SQLException {
		Paciente paci = new Paciente();
		
		paci.setNombre(resultSet.getString("Nombre"));
		paci.setApellido(resultSet.getString("Apellido"));
		paci.setSexo(resultSet.getString("Sexo"));
		paci.setNacionalidad(resultSet.getString("Nacionalidad"));
		paci.setFechaNac(resultSet.getDate("FechaNac"));
		paci.setDireccion(resultSet.getString("Direccion"));
		paci.setLocalidad(resultSet.getString("Localidad"));
		paci.setEmail(resultSet.getString("Email"));
		paci.setTelefono(resultSet.getString("Telefono"));
		
		return paci;
	}

	/**
	 * This function retrieves a list of all patients from a database and returns it as an ArrayList of
	 * Paciente objects.
	 * 
	 * @return An ArrayList of Paciente objects.
	 */
	public ArrayList<Paciente> readAll() {
		
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<Paciente> ListPaciente = new ArrayList<Paciente>();
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement("SELECT USU.Nombre, USU.Apellido,P.Sexo,pais.Descripcion AS Nacionalidad,P.FechaNac, P.Direccion, Loc.Descripcion AS Localidad ,USU.Email, P.Telefono FROM paciente AS P " + 
					"INNER JOIN usuarios AS USU on P.DNI = USU.DNI " + 
					"INNER JOIN pais on P.Id_Nacionalidad = pais.Id " + 
					"INNER JOIN localidad AS Loc on P.ID_localidad = Loc.Id");
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				ListPaciente.add(getPaciente(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return ListPaciente;
	}
}
