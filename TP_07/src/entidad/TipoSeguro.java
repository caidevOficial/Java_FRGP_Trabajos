package entidad;

public class TipoSeguro {

	private int Id;
	private String Descripcion;
	
	public TipoSeguro() {
		this.Id = 0;
		this.Descripcion = "";
	}
	public TipoSeguro(int id, String Descripcion) {
		this.Id = id;
		this.Descripcion = Descripcion;
	}
	
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	@Override
	public String toString() {
		return  Descripcion ;
	}

	
}
