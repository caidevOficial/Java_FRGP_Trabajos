package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidad.Seguro;
import dao.Conexion;


public class Segurodao {


	
	public boolean AgregarSeguro(Seguro Seg) {
		
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean isInsertExitoso = false;
		
		try {
			statement = conexion.prepareStatement("Insert into seguros(Descripcion, idTipo, costoContratacion, costoAsegurado) values (?, ?, ?, ?)");
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
			
			
			
		}catch (SQLException e) 
		{
			e.printStackTrace();
			try {
				conexion.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		return isInsertExitoso;				
		
	}


	public int NuevoId() {
		
		PreparedStatement statement;
		ResultSet resultSet; 
		int Nuevoid = 1;
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement("SELECT max(idSeguro + 1) as NuevoId FROM Seguros");
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				Nuevoid = resultSet.getInt("NuevoId");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return Nuevoid;
		
		
	}
	
public List<Seguro> readAll(String Where) {
		
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<Seguro> personas = new ArrayList<Seguro>();
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement("SELECT idSeguro, descripcion, idTipo, costoContratacion,costoAsegurado FROM Seguros " + Where);
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				personas.add(getSeguro(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return personas;
		
		
	}

public List<Seguro> readAll() {
	
	PreparedStatement statement;
	ResultSet resultSet; 
	ArrayList<Seguro> personas = new ArrayList<Seguro>();
	Conexion conexion = Conexion.getConexion();
	try 
	{
		statement = conexion.getSQLConexion().prepareStatement("SELECT idSeguro, descripcion, idTipo, costoContratacion,costoAsegurado FROM Seguros ");
		resultSet = statement.executeQuery();
		while(resultSet.next())
		{
			personas.add(getSeguro(resultSet));
		}
	} 
	catch (SQLException e) 
	{
		e.printStackTrace();
	}
	return personas;
	
	
}


	

private Seguro getSeguro(ResultSet resultSet) throws SQLException
{

	int id = resultSet.getInt("idSeguro");
	String Descripcion = resultSet.getString("descripcion");
	int idTipo = resultSet.getInt("idTipo"); 
	float CostoCon =  resultSet.getFloat("costoContratacion");
	float CostoAseg= resultSet.getFloat("costoAsegurado");
	return new Seguro(id, Descripcion, idTipo, CostoCon, CostoAseg);
}
	
}
