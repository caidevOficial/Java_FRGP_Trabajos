package dominio;

public class Categorias {
	String Genero;

	public Categorias(String Gene) {
		Genero = Gene;
	}
	
	@Override
	public String toString() {
		return  Genero ;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}
}
