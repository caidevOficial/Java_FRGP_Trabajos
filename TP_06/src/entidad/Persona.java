package entidad;

public class Persona {

	private String Nombre;
	private String Apellido;
	private String Dni;
	
	public Persona(String nom, String Ape, String Dni)
	{
		this.Nombre = nom;	
		this.Apellido = Ape;			
		this.Dni = Dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}
	
}
