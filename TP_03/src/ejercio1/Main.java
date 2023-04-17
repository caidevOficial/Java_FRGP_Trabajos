package ejercio1;


public class Main {

	public static void main(String[] args) throws DniInvalido {
		// TODO Auto-generated method stub
		
		
		
		boolean valido = VerificarDniInvalido("37245A05");
		if (!valido)
		{
			DniInvalido Exp1 = new DniInvalido();
			throw Exp1;
		}
		
	
		

	}

	
	
	private static boolean VerificarDniInvalido(String DNI)
	{
		if(!DNI.matches("[0-9]*")){
			   return false;
			}
		
		return true;
		
	}
}
