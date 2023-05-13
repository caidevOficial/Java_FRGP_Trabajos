package dominio;

/**
 * The `Categorias` class has a constructor, getter, and setter methods for a `Genero` variable, and
 * overrides the `toString()` method to return the value of `Genero`.
 */
public class Categorias {
	String Genero;

	// A constructor method for the `Categorias` class that takes a `String` parameter called `Gene` and
	// assigns its value to the instance variable `Genero`.
	public Categorias(String Gene) {
		this.Genero = Gene;
	}
	
	/**
	 * This is a Java function that overrides the default toString() method to return the value of a
	 * variable called "Genero".
	 * 
	 * @return The method is returning a string representation of the value stored in the variable
	 * "Genero".
	 */
	@Override
	public String toString() {
		return  this.Genero ;
	}

	/**
	 * This function returns the value of the variable "Genero" as a string.
	 * 
	 * @return The method `getGenero()` is returning a `String` value, which is the value of the variable
	 * `Genero`.
	 */
	public String getGenero() {
		return this.Genero;
	}

	/**
	 * This function sets the value of a variable called "Genero" to the input parameter "genero".
	 * 
	 * @param genero The parameter "genero" is a String variable that represents the gender of a person or
	 * character. This method sets the value of the "Genero" variable to the value passed in the "genero"
	 * parameter.
	 */
	public void setGenero(String genero) {
		this.Genero = genero;
	}
}
