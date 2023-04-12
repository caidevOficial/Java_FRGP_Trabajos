package ejercicio3;

public class Polideportivo extends Edificio{
	
	///atributos
	private int tipoDeInstalacion;
	
	///Constructores
	
	public Polideportivo() {
		super();
		this.tipoDeInstalacion = 0;
		
	}
	public Polideportivo(String nombre, Double superficieEdificio, int tipoDeInstalacion) {
		super(nombre, superficieEdificio);
		this.tipoDeInstalacion = tipoDeInstalacion;
		
	}
	///Getters y setters
	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}
	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}
	///toString
	@Override
	public String toString() {
		return "Es un polideportivo cuyo nombre es " + getNombre()+" y su superficie en metros es de " + super.getSuperficieEdificio();
	}
	
	
	
	
	
	
	

}
