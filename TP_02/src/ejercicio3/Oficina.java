package ejercicio3;

public class Oficina extends Edificio {
	
	///ATRIBUTOS
	private String numeroOficinas;
	
	///CONSTRUCTORES
	public Oficina() {
		super();
		this.numeroOficinas = "Sin oficinas";
		
	}
	public Oficina(String nombre, Double superficieEdificio, String numeroOficinas) {
		
		super(nombre, superficieEdificio);
		this.numeroOficinas = numeroOficinas;
	}
	
	///getters y setters
	public String getNumeroOficinas() {
		return numeroOficinas;
	}
	public void setNumeroOficinas(String numeroOficinas) {
		this.numeroOficinas = numeroOficinas;
	}

	///toString
	@Override
	public String toString() {
		return "El numero de oficinas que tiene este edificio es " + numeroOficinas;
	}
	
}
