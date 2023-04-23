package ejercio1;

import java.util.LinkedList;

import java.util.List;
import java.util.TreeSet;
import java.util.Collections;

public class Main 
{

	public static void main(String[] args) throws DniInvalido 
	{

		/*boolean valido = VerificarDniInvalido("3724505");
		if (!valido)
		{
			DniInvalido Exp1 = new DniInvalido();
			throw Exp1;
		}*/
		
		Persona aux = new Persona();
		TreeSet<Persona> ListaPersona = new TreeSet<Persona>();
		ListaPersona = aux.LeetDatos();
		for(Persona item : ListaPersona)
		{
			System.out.println(item.toString());
		}

	}

	
	
	
}
