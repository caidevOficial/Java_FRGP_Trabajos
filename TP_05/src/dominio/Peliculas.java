package dominio;

/**
 * The Peliculas class is a Java class that represents a movie with properties such as id, name, and
 * genre.
 */
public class Peliculas {
	private int id;
	private String Nombre;
	private Categorias Genero;
	
	/**
	 * The function returns the value of the "id" variable.
	 * 
	 * @return The method `getId()` is returning an integer value which represents the `id` of an object.
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * This function sets the value of the "id" variable in a Java class.
	 * 
	 * @param id The parameter "id" is an integer that represents the unique identifier of an object. The
	 * method "setId" sets the value of the "id" variable to the value passed as a parameter.
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * This Java function returns the value of the "Nombre" variable.
	 * 
	 * @return The method `getNombre()` is returning the value of the instance variable `Nombre`.
	 */
	public String getNombre() {
		return this.Nombre;
	}
	
	/**
	 * This function sets the value of the "Nombre" variable in a Java class.
	 * 
	 * @param nombre The parameter "nombre" is a String type variable that represents the name that we
	 * want to set for an object. The method "setNombre" is used to set the value of the instance variable
	 * "Nombre" to the value passed as the parameter "nombre".
	 */
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	
	/**
	 * This function returns the genre category of an object.
	 * 
	 * @return The method `getGenero()` is returning an object of the class `Categorias`, which represents
	 * the genre of something (e.g. a book, a movie, etc.).
	 */
	public Categorias getGenero() {
		return this.Genero;
	}
	
	/**
	 * This function sets the category (genero) of an object.
	 * 
	 * @param genero genero is a variable of type Categorias that represents the genre of a certain item
	 * or object. The method setGenero() sets the value of the instance variable Genero to the value
	 * passed as the parameter genero.
	 */
	public void setGenero(Categorias genero) {
		this.Genero = genero;
	}
	
	/**
	 * This is a Java function that overrides the default toString() method to return a formatted string
	 * containing the object's id and name.
	 * 
	 * @return A formatted string that includes the id and name of an object.
	 */
	@Override
	public String toString() {
		return String.format("%i - %s", this.id, this.Nombre);
	}
}
