package Entidad;

/**
 * The Seguro class represents a type of insurance with properties such as ID, description, type, and
 * cost.
 */
public class Seguro {

	private int Id;
	private String Descripcion;
	private int Tipo;
	private float CosContra;
	private float CosAseg;
	
	
	public Seguro() {}
	
	
	// This is a constructor method for the Seguro class that takes in five parameters: an integer ID, a
	// string description, an integer type, a float cost for the contract, and a float cost for the
	// insurance. It sets the values of the corresponding instance variables using the "this" keyword to
	// refer to the current object.
	public Seguro(int id, String descri, int tipo, float costCont, float CostAseg)
	{
		this.Id = id;
		this.Descripcion = descri;
		this.Tipo = tipo;
		this.CosContra = costCont;
		this.CosAseg = CostAseg;
	}
	
	/**
	 * The function returns the value of the Id variable.
	 * 
	 * @return The method is returning an integer value which is the value of the variable "Id".
	 */
	public int getId() {
		return this.Id;
	}

	/**
	 * This Java function sets the value of the "Id" variable to the input integer value.
	 * 
	 * @param id The parameter "id" is an integer value that is passed as an argument to the method. It is
	 * used to set the value of the instance variable "Id" to the value of the parameter.
	 */
	public void setId(int id) {
		this.Id = id;
	}

	/**
	 * This function returns the value of the variable "Descripcion" as a string.
	 * 
	 * @return The method `getDescripcion()` is returning a `String` value, which is the value of the
	 * variable `Descripcion`.
	 */
	public String getDescripcion() {
		return this.Descripcion;
	}

	/**
	 * This Java function sets the value of a variable called "Descripcion".
	 * 
	 * @param descripcion The parameter "descripcion" is a String type variable that represents the
	 * description of something. The method "setDescripcion" sets the value of the instance variable
	 * "Descripcion" to the value passed as the parameter "descripcion".
	 */
	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}
	
	/**
	 * This function returns the value of the variable "Tipo".
	 * 
	 * @return The method is returning an integer value which represents the "Tipo" variable.
	 */
	public int getTipo() {
		return this.Tipo;
	}
	
	/**
	 * This function sets the value of a variable called "Tipo" to the input integer value.
	 * 
	 * @param tipo The "tipo" parameter is an integer value that represents the type of something. The
	 * purpose of this method is to set the value of the "Tipo" variable to the specified integer value.
	 */
	public void setTipo(int tipo) {
		this.Tipo = tipo;
	}
	
	/**
	 * The function returns the value of the variable "CosContra" as a float.
	 * 
	 * @return The method `getCosContra()` is returning a `float` value, which is the value of the
	 * variable `CosContra`.
	 */
	public float getCosContra() {
		return this.CosContra;
	}
	
	/**
	 * This Java function sets the value of a variable called "CosContra".
	 * 
	 * @param cosContra cosContra is a float type parameter that represents the cosine of the angle
	 * between the normal vector of a surface and the direction of incident light. It is commonly used in
	 * computer graphics and 3D rendering to calculate the amount of light reflected off a surface.
	 */
	public void setCosContra(float cosContra) {
		this.CosContra = cosContra;
	}
	
	/**
	 * The function returns the value of the variable "CosAseg" as a float.
	 * 
	 * @return The method `getCosAseg()` is returning a `float` value which is the value of the instance
	 * variable `CosAseg`.
	 */
	public float getCosAseg() {
		return this.CosAseg;
	}
	
	/**
	 * This is a Java function that sets the value of a variable called "CosAseg".
	 * 
	 * @param cosAseg cosAseg is a float variable that represents the cosine of an angle in radians. It is
	 * being set to a new value using the setter method setCosAseg.
	 */
	public void setCosAseg(float cosAseg) {
		this.CosAseg = cosAseg;
	}
}
