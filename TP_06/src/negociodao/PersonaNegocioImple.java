/**
 * MIT License
 *
 * Copyright (C) 2023 <Grupo 3 - UTN FRGP>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

 package negociodao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import dao.PersonaDAO;
import daolmpl.personaDaoImpl;
import entidad.Persona;
import negocio.IPersonaNegocio;

/**
 * This is a Java class that implements an interface for adding and checking the existence of a person
 * in a MySQL database.
 */
public class PersonaNegocioImple implements IPersonaNegocio {
	
	PersonaDAO pdao = new personaDaoImpl();

	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "3r1c5d9";
	private String dbName = "bdpersonas";
	
	
	/**
	 * This Java function adds a new person to a database table called "personas".
	 * 
	 * @param Perso An object of the class Persona, which contains information about a person such as
	 * their name, last name, and ID number (DNI).
	 * @return The method returns a boolean value indicating whether the operation of adding a new person
	 * to the database was successful or not. It returns true if one row was affected (i.e., the person
	 * was added), and false otherwise.
	 */
	@Override
	public boolean AgregarPersona(Persona Perso) {
		
		String query = String.format(
			"INSERT INTO `personas` (dni, nombre, apellido) VALUES ('%s','%s','%s');", 
			Perso.getDni(), Perso.getNombre(), Perso.getApellido());
		Connection cn = null;
		
		try {
			cn = DriverManager.getConnection(host+dbName,user,pass);
			java.sql.Statement st =  cn.createStatement();
			int Filas = st.executeUpdate(query);
			if (Filas == 1){
				return true;				
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return false;
	}

	/**
	 * This Java function checks if a person with a given DNI exists in a database.
	 * 
	 * @param dni The parameter "dni" is a String representing the DNI (Documento Nacional de Identidad)
	 * of a person.
	 * @return The method is returning a boolean value, which is true if a person with the given DNI
	 * exists in the "personas" table of the database, and false otherwise.
	 */
	@Override
	public boolean ExistePersona(String dni) {

		Connection cn = null;
		
		try {
			cn = DriverManager.getConnection(host+dbName,user,pass);
			java.sql.Statement st =  cn.createStatement();
			String query = String.format("SELECT dni FROM `personas` WHERE dni ='%s';", dni);
			ResultSet rs = st.executeQuery(query);
			if (rs.next()){
				// DEVUELVO QUE EXISTE
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		// NO EXISTE
		return false;
	}

	@Override
	public boolean delete(Persona persona_a_eliminar) {
		boolean estado=false;
		if(persona_a_eliminar.getDni().trim().length()>0 )
		{
			estado=pdao.delete(persona_a_eliminar);
		}
		return estado;
		
	}
}
