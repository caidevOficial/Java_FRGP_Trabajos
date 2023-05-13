package dominio;

public class Peliculas {
	private int id;
	private String Nombre;
	private Categorias Genero;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Categorias getGenero() {
		return Genero;
	}
	public void setGenero(Categorias genero) {
		Genero = genero;
	}
	@Override
	public String toString() {
		return id + " - " + Nombre  ;
	}
	
}
