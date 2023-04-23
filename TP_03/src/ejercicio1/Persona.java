package ejercicio1;

import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Persona implements Comparable<Persona>
{

	
	//VARIABLES
		private String nombre;
		private String apellido;
		private int dni;
		
		private String Ruta = "Personas.txt";
		
		// GETTERS Y SETTERS
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
		  if(!nombre.isEmpty()) {
				this.nombre = nombre;
		  }
		}	
		
		public String getApellido() {
			return apellido;
		}
		
		public void setApellido(String Apellido) {
		  if(!Apellido.isEmpty()) {
				this.apellido= Apellido;
		  }
		}

		public int getDni() {
			return dni;
		}
		
		public void setDni(int Dni) {
			this.dni = Dni;	  
		}

		public TreeSet<Persona> LeetDatos() {
			TreeSet<Persona> aux = new TreeSet<Persona>();
			
			if(!Existe(Ruta)) {
				return null;
			}
			
			FileReader Reader;
			
			try 
			{
				Reader = new FileReader(Ruta);
				BufferedReader Buffer = new BufferedReader(Reader);
				String Linea = "";
				
				while(Linea != null)
				{
					Linea = Buffer.readLine();	
					if(Linea != null) {
						if(!Linea.isEmpty()) {
							aux.add(DevolverPersona(Linea));
						}
					}
				}
				Reader.close();
				Buffer.close();
				return aux;
			}
			catch (IOException e)
			{
				e.printStackTrace();
				return null;
			}			
		}
		
		/**
		 * Reads a line at time and returns an object of Persona class
		 * @param Linea The string to get information to create a 'Persona' object.
		 * @return a 'Persona' object.
		 * @throws DniInvalido Throws an exception if the DNI is invalid.
		 */
		public Persona DevolverPersona(String Linea) throws DniInvalido	{
			Persona persona = new Persona();
			String[] words = Linea.split("-");	
			persona.nombre = words[0].trim();
			persona.apellido = words[1].trim();
			
			if (!VerificarDniInvalido(words[2])) {
				DniInvalido Exp1 = new DniInvalido();
				persona.dni = 99999999;
			} else {
				persona.dni = Integer.parseInt(words[2].trim());
			}
			
			return persona;
				
		}
		
		/**
		 * Tries to validate if the given DNI contains only numbers.
		 * @param DNI The string that represents a DNI to validate.
		 * @return True if the given DNI is correct, False otherwise.
		 */
		private boolean VerificarDniInvalido(String DNI)
		{
			if(!DNI.matches("[0-9]*")){
				   return false;
				}
			
			return true;
			
		}
		
		public boolean Existe(String _Ruta) {		
			File Archivo = new File(Ruta);
			if(Archivo.exists())
				return true;
			
			return false;	
		}
		
		public String toString() {
			StringBuilder mensaje = new StringBuilder();
			mensaje.append("D.N.I: "+this.dni+"\t");
			mensaje.append("Apellido  : "+this.apellido+"\t");
			mensaje.append("Nombre: "+this.nombre+".");
			
			return mensaje.toString();
		}
	
		@Override
		public int compareTo(Persona o) {
			
			if(o.apellido.charAt(0) == this.apellido.charAt(0)) {
				return 0;
			}
			
			
			if(o.apellido.charAt(0) < this.apellido.charAt(0)) 	{
				return 1;
			}
			
			return -1;
		}
}
