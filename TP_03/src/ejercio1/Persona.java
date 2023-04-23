package ejercio1;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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
		public String getNombre() 
		{
			return nombre;
		}
		public void setNombre(String nombre)
		{
		  if(!nombre.isEmpty()) 
		  {
				this.nombre = nombre;
		  }
		}	
		public String getApellido() 
		{
			return apellido;
		}
		public void setApellido(String Apellido)
		{
		  if(!Apellido.isEmpty()) 
		  {
				this.apellido= Apellido;
		  }
		}
	
		public int getDni() {
			return dni;
		}
		public void setDni(int Dni)
		{
		  				this.dni = Dni;	  
		}

		public TreeSet<Persona> LeetDatos()
		{
			TreeSet<Persona> aux = new TreeSet<Persona>();
			if(!Existe(Ruta)) 
			{
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
					if(Linea != null)
					{
					if(!Linea.isEmpty())
					aux.add(DevolverPersona(Linea));
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
		
		public Persona DevolverPersona(String Linea) throws DniInvalido
		{
			Persona persona = new Persona();
			String Nombre ="";
			String Apellido = "";
			String dni = "";
			int bandera = 0;
			int cont = 0;
				for(int i = 0; i < Linea.length(); i++)
				{
					if(cont == 0) 
					{
						if(Linea.charAt(i) != '-') 
						{							
							Nombre += Linea.charAt(i);								
						}
						else
						{
							cont++;
						}
					}
					else if(cont == 1) 
					{
						if(Linea.charAt(i) != '-') 
						{							
							Apellido += Linea.charAt(i);								
						}
						else
						{
							cont++;
						}
					}
					else if(cont == 2) 
					{
						if(Linea.charAt(i) != '-') 
						{		
							if(bandera == 0) 
							{
								dni = String.valueOf(Linea.charAt(i));
								bandera++;
							}
							else
							{
							dni += String.valueOf(Linea.charAt(i));
							}
						}
						else
						{
							break;
						}
					}
				}
				persona.nombre = Nombre;
				persona.apellido = Apellido;
				boolean valido = VerificarDniInvalido(dni);
				if (!valido)
				{
					DniInvalido Exp1 = new DniInvalido();
					persona.dni = 99999999;
				}
				else
				{
				persona.dni = Integer.parseInt(dni);
				}
				return persona;
				
		}
		private boolean VerificarDniInvalido(String DNI)
		{
			if(!DNI.matches("[0-9]*")){
				   return false;
				}
			
			return true;
			
		}
		
		public Boolean Existe(String _Ruta) 
			{		
			File Archivo = new File(Ruta);
			if(Archivo.exists())
				return true;
			
			return false;	
			}
		
		public String toString() {
			StringBuilder mensaje = new StringBuilder();
			mensaje.append("*************************\n");
			mensaje.append("* Nombre: "+this.nombre+".\n");
			mensaje.append("* Apellido  : "+this.apellido+", \n");
			mensaje.append("* D.N.I: "+this.dni+". \n");
			mensaje.append("*************************\n");
			
			return mensaje.toString();
		}
		
//		@Override
//		public int compareTo(Object aux) 
//		{
//			// TODO Auto-generated method stub
//			return  ((Persona) aux).getDni() - this.getDni();
//		}
		@Override
		public int compareTo(Persona o) {
			
			
			if(o.nombre.charAt(0) == this.nombre.charAt(0)) 
			{
				return 0;
			}
			
			
			if(o.nombre.charAt(0) < this.nombre.charAt(0)) 
			{
				return 1;
			}
			
			return -1;
		}
		
		
}
