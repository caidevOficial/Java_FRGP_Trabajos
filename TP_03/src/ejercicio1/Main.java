package ejercicio1;

import java.util.TreeSet;


public class Main 
{
	final static String ruta = "Java_FRGP_Trabajos\\TP_03";
	
	public static void main(String[] args) throws DniInvalido {
		
		Archivo Resultado = new Archivo();
		Resultado.setRuta(ruta);
		
		
		Persona aux = new Persona();
		TreeSet<Persona> ListaPersona = new TreeSet<Persona>();
		ListaPersona = aux.LeetDatos();
		
		for(Persona item : ListaPersona) {
			System.out.println(item.toString());
			
		}
	}
}
