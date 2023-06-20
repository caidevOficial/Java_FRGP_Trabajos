package Entidad;

/**
 * The class "Especialidad" defines an object with an ID and description attribute, along with getter
 * and setter methods for each attribute.
 */
public class Especialidad
{
	private int Id;
	private String Descripcion;

	public Especialidad () 
	{
		
	}

	public Especialidad (int _Id, String _Descripcion)
	{
		this.Id = _Id;
		this.Descripcion = _Descripcion;
	}

	//GETS Y SETS
	/**
	 * The function returns the value of the "Id" variable.
	 * 
	 * @return The method is returning the value of the instance variable `Id`.
	 */
	public int getId() {
		return this.Id;
	}


	/**
	 * This Java function sets the value of the "Id" variable to the input parameter "_Id".
	 * 
	 * @param _Id The parameter _Id is an integer value representing the DNI (Documento Nacional de
	 * Identidad) of a person.
	 */
	public void setDNI(int _Id) {
		this.Id = _Id;
	}


	/**
	 * This function returns the description of an object.
	 * 
	 * @return The method `getDescripcion()` is returning the value of the instance variable
	 * `Descripcion`.
	 */
	public String getDescripcion() {
		return this.Descripcion;
	}


	/**
	 * This is a Java function that sets the value of a variable called "Descripcion".
	 * 
	 * @param _Descripcion _Descripcion is a parameter of type String that represents the new value for
	 * the "Descripcion" attribute of an object. The "setDescripcion" method is a setter method that
	 * assigns the value of _Descripcion to the Descripcion attribute of the object.
	 */
	public void setDescripcion(String _Descripcion) {
		this.Descripcion = _Descripcion;
	}

}
