package ejercicio1;

import java.io.IOException;
import java.util.Arrays;

@SuppressWarnings("serial")
public class DniInvalido extends IOException {

	@Override
	public String getMessage() {
		return "El Dni es invalido";
	}


	
	
	
}
