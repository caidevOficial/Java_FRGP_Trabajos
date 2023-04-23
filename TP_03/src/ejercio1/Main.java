package ejercio1;

<<<<<<< HEAD
import java.util.LinkedList;

import java.util.List;
import java.util.TreeSet;
import java.util.Collections;

public class Main 
{

	public static void main(String[] args) throws DniInvalido 
	{

		/*boolean valido = VerificarDniInvalido("3724505");
=======

public class Main {

	public static void main(String[] args) throws DniInvalido {
		// TODO Auto-generated method stub
		
		
		
		boolean valido = VerificarDniInvalido("37245A05");
>>>>>>> e8f6d5f72c6a9ca7878f5be769b97688d6011c72
		if (!valido)
		{
			DniInvalido Exp1 = new DniInvalido();
			throw Exp1;
<<<<<<< HEAD
		}*/
		
		Persona aux = new Persona();
		TreeSet<Persona> ListaPersona = new TreeSet<Persona>();
		ListaPersona = aux.LeetDatos();
		for(Persona item : ListaPersona)
		{
			System.out.println(item.toString());
		}
=======
		}
		
	
		
>>>>>>> e8f6d5f72c6a9ca7878f5be769b97688d6011c72

	}

	
	
<<<<<<< HEAD
	
=======
	private static boolean VerificarDniInvalido(String DNI)
	{
		if(!DNI.matches("[0-9]*")){
			   return false;
			}
		
		return true;
		
	}
>>>>>>> e8f6d5f72c6a9ca7878f5be769b97688d6011c72
}
