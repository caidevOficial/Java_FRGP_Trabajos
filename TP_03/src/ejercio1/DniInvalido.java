package ejercio1;

import java.io.IOException;
import java.util.Arrays;

public class DniInvalido extends IOException {

	public DniInvalido()
	{
		
	}

	@Override
	public String getMessage() {
		return "el Dni es invalido";
	}


	
	
	
}
