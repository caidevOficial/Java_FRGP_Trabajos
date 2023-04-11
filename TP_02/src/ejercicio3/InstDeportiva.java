package ejercicio3;

public class InstDeportiva {
	///atributos
	
	private String nombre;
	
	///constructores
	public InstDeportiva(){
		
		this.nombre = "Sin nombre";
	}
	public InstDeportiva(String nombre){
		
		this.nombre = nombre;
	}
	
	///getters y  setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	///toString

	@Override
	public String toString() {
		return "La institucion se llama" + nombre;
	}
	
	
	

}
