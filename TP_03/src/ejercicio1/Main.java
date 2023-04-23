package ejercicio1;

import java.util.TreeSet;

public class Main 
{
	
	public static void main(String[] args) throws DniInvalido {

		Persona aux = new Persona();
		TreeSet<Persona> ListaPersona = new TreeSet<Persona>();
		ListaPersona = aux.LeetDatos();
		
		for(Persona item : ListaPersona) {
			System.out.println(item.toString());
		}
	}
}
