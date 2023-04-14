package ejercicio3;

public class InstDeportiva extends Edificio {
	///atributos
	
	private final int ID;
	private String nombre;
	private int TipoDeInstalacion;
	
	//ATRIBUTOS DE LA CLASE
	static int cont = 0;

	
	///constructores
	public InstDeportiva(){
		this.ID = cont;
		this.nombre = "Sin nombre";
		this.TipoDeInstalacion = 0;
		cont++;
	}
	public InstDeportiva(String nombre, int TipoDeInstalacion){
		
		this.nombre = nombre;
		this.ID = cont;
		this.TipoDeInstalacion = TipoDeInstalacion;
		cont++;
	}
	
	///getters y  setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getID() {
		return ID;
	}
//	public void setID(int iD) {
//		ID = iD;
//	}
	public int getTipoDeInstalacion() {
		return TipoDeInstalacion;
	}
	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		TipoDeInstalacion = tipoDeInstalacion;
	}
	///toString
	
	@Override
	public String toString() {
		return "InstDeportiva ID=" + ID + ", El nombre de la instalacion es= " + nombre + ", Su tipo de instalacion=" + TipoDeInstalacion;
	}
		
	

	
	

}
