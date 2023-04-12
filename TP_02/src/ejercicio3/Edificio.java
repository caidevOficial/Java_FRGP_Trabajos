package ejercicio3;

public class Edificio {

	///atributos
	private final int ID;
	private String nombre;
	private Double superficieEdificio;
	
	//ATRIBUTOS DE LA CLASE
	static int cont = 0;
	
	
	public Edificio() {
		ID = cont;
		this.nombre = "Sin Nombre";
		this.superficieEdificio = 0.0;
		cont++;
	}
	

	public Edificio(String nombre, Double superficieEdificio) {
		ID = cont;
		this.nombre = nombre;
		this.superficieEdificio = superficieEdificio;
		cont++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSuperficieEdificio() {
		return superficieEdificio;
	}

	public void setSuperficieEdificio(Double superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}

	public int getID() {
		return ID;
	}


	@Override
	public String toString() {
		return "Edificio ID=" + ID + ", nombre=" + nombre + ", superficieEdificio=" + superficieEdificio + "]";
	}
	
	
}
