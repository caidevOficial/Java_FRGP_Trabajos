package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.Conexion;
import entidad.Seguro;


public class Segurodao {


	
	public boolean AgregarSeguro(Seguro Seg) {
		
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean isInsertExitoso = false;
		
		try {
			statement = conexion.prepareStatement("Insert into Seguros(idSeguro,descripcion,idTipo,costoContratacion, costoAsegurado) values (?, ?, ?, ?, ?)");
			statement.setInt(1, Seg.getId());
			statement.setString(2, Seg.getDescripcion());
			statement.setInt(3, Seg.getTipo());
			statement.setFloat(4, Seg.getCosContra());
			statement.setFloat(5, Seg.getCosAseg());
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
	
public ArrayList<Seguro> readAll(String Where) {
		
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

public ArrayList<Seguro> readAll() {
	
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
