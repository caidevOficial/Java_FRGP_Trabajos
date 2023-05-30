package Entidad;

/**
 * The class TipoSeguro defines a type of insurance with an ID and description.
 */
public class TipoSeguro {
	
	private int idTipo;
	private String descripcion;
	
	// `public TipoSeguro() {}` is a default constructor for the `TipoSeguro` class that takes no
	// arguments and does not perform any actions. It is provided by the programmer to allow the creation
	// of objects of the `TipoSeguro` class without passing any initial values.
	public TipoSeguro() {}

	// The `public TipoSeguro(int idTipo, String descripcion)` is a constructor for the `TipoSeguro` class
	// that takes two arguments: `idTipo` and `descripcion`. It initializes the `idTipo` and `descripcion`
	// instance variables of the `TipoSeguro` object being created with the values passed as arguments.
	// The `super()` method is called to invoke the constructor of the superclass (which in this case is
	// `Object`) and ensure that any necessary initialization is performed.
	public TipoSeguro(int idTipo, String descripcion) {
		super();
		this.idTipo = idTipo;
		this.descripcion = descripcion;
	}
	
	/**
	 * The function returns the value of the variable "idTipo".
	 * 
	 * @return The method `getIdTipo()` is returning an integer value which represents the `idTipo`
	 * attribute of the current object.
	 */
	public int getIdTipo() {
		return this.idTipo;
	}
	
	/**
	 * This function sets the value of the variable "idTipo" in a Java class.
	 * 
	 * @param idTipo idTipo is an integer variable that represents the ID of a certain type. The method
	 * setIdTipo sets the value of this variable to the provided integer parameter.
	 */
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	
	/**
	 * This function returns the description of an object.
	 * 
	 * @return The method `getDescripcion()` is returning the value of the instance variable
	 * `descripcion`.
	 */
	public String getDescripcion() {
		return this.descripcion;
	}
	
	/**
	 * This function sets the description of an object in Java.
	 * 
	 * @param descripcion The parameter "descripcion" is a String variable that represents the description
	 * of an object. The "setDescripcion" method is used to set the value of this variable to a new value
	 * passed as an argument to the method.
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * This function returns a string representation of an object of the class TipoSeguro.
	 * 
	 * @return A string representation of an object of the class TipoSeguro, which includes the values of
	 * its instance variables idTipo and descripcion.
	 */
	@Override
	public String toString() {
		return String.format("TipoSeguro [idTipo=%s , descripcion=%s]", this.idTipo, this.descripcion);
	}
}
