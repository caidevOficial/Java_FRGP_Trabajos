package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * The `Conexion` class provides a singleton instance of a database connection to a MySQL database.
 */
public class Conexion {

	public static Conexion instancia;
	private Connection connection;
	
	// This is a private constructor for the `Conexion` class. It initializes a connection to a MySQL
	// database using the `com.mysql.jdbc.Driver` driver and the `getConnection()` method of the
	// `DriverManager` class. The connection is set to not auto-commit by default. If an exception occurs
	// during the connection process, it will be printed to the console.
	private Conexion()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); // quitar si no es necesario
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tpIntegrador","root","root");
			this.connection.setAutoCommit(false);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	/**
	 * This function returns a singleton instance of a database connection.
	 * 
	 * @return The method `getConexion()` is returning an instance of the `Conexion` class.
	 */
	public static Conexion getConexion()   
	{								
		if(instancia == null)
		{
			instancia = new Conexion();
		}
		return instancia;
	}
	
	
	
	/**
	 * The function returns a SQL connection.
	 * 
	 * @return The method is returning a Connection object.
	 */
	public Connection getSQLConexion() 
	{
		return this.connection;
	}
}
