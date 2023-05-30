package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidad.Seguro;
import entidad.TipoSeguro;

public class TipoSeguroDao {

	
	public ArrayList<TipoSeguro> readAll() {
		
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<TipoSeguro> Tsegs = new ArrayList<TipoSeguro>();
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement("SELECT idTipo, descripcion FROM tiposeguros;");
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				Tsegs.add(getTipoSeguro(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return Tsegs;
		
		
	}
	
	private TipoSeguro getTipoSeguro(ResultSet resultSet) throws SQLException
	{

		int id = resultSet.getInt("idTipo");
		String Descripcion = resultSet.getString("descripcion");
		
		return new TipoSeguro(id, Descripcion);
	}
	
	public String BuscaDescripcion(int Id) 
	{
		PreparedStatement statement;
		ResultSet resultSet; 
		TipoSeguro Tseg = new TipoSeguro();
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement("SELECT idTipo, descripcion FROM tiposeguros WHERE idTipo = " + Id);
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				Tseg = getTipoSeguro(resultSet);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return Tseg.getDescripcion();
	}

}
