package Entidad;

import java.util.Date;

/**
 * The Paciente class represents a patient and contains their personal information such as name,
 * address, and contact details.
 */
public class Paciente
{
	private String DNI;
	private String Nombre;
	private String Apellido;
	private String Sexo;
	private String Nacionalidad;
	private Date FechaNac;
	private String Direccion;
	private String Localidad;
	private String Email;	
	private String Telefono;	
	
	// This is a default constructor for the `Paciente` class that takes no parameters. It initializes a
	// new `Paciente` object with default values for all instance variables.
	public Paciente ()
	{
	}

	// This is a constructor method for the `Paciente` class that takes a `String` parameter `_Dni`
	// representing the patient's identification number (DNI) and sets the value of the `DNI` instance
	// variable to the value of the `_Dni` parameter. This allows for the creation of a `Paciente` object
	// with a pre-defined DNI value.
	public Paciente (String _Dni)
	{
		this.DNI = _Dni;
	}

	//GETS Y SETS
	/**
	 * This function returns the DNI (identification number) as a string.
	 * 
	 * @return The method `getDni()` is returning the value of the instance variable `DNI`, which is
	 * likely a String representing a person's identification number.
	 */
	public String getDni() {
		return this.DNI;
	}


	/**
	 * This Java function sets the value of the DNI variable.
	 * 
	 * @param _Dni _Dni is a parameter of type String that represents the new value for the DNI (Documento
	 * Nacional de Identidad) attribute of an object. The method setDNI is a setter method that allows to
	 * modify the value of the DNI attribute of an object.
	 */
	public void setDNI(String _Dni) {
		this.DNI = _Dni;
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
	 * This Java function sets the value of a variable called "Nombre".
	 * 
	 * @param _Nombre _Nombre is a parameter of type String that represents the new value to be set for
	 * the "Nombre" instance variable. This method is a setter method that allows you to update the value
	 * of the "Nombre" variable with a new value passed as an argument.
	 */
	public void setNombre(String _Nombre) {
		this.Nombre = _Nombre;
	}

	/**
	 * This function returns the value of the "Apellido" variable.
	 * 
	 * @return The method `getApellido()` is returning the value of the instance variable `Apellido`.
	 */
	public String getApellido() {
		return this.Apellido;
	}


	/**
	 * This function sets the value of the "Apellido" variable in a Java class.
	 * 
	 * @param _Apellido _Apellido is a variable of type String that represents the last name or surname of
	 * a person. It is used as a parameter in the setApellido method to set the value of the Apellido
	 * instance variable of an object to the value passed as an argument.
	 */
	public void setApellido(String _Apellido) {
		this.Apellido = _Apellido;
	}

	/**
	 * This function returns the value of the "Sexo" variable.
	 * 
	 * @return The method `getSexo()` is returning the value of the instance variable `Sexo`.
	 */
	public String getSexo() {
		return this.Sexo;
	}


	/**
	 * This function sets the value of the "Sexo" variable in a Java program.
	 * 
	 * @param _Sexo _Sexo is a parameter of type String that represents the gender of a person. It is used
	 * in a method to set the value of the instance variable "Sexo" to the value passed as the parameter.
	 */
	public void setSexo(String _Sexo) {
		this.Sexo = _Sexo;
	}

	/**
	 * This function returns the nationality of an object.
	 * 
	 * @return The method `getNacionalidad()` is returning a `String` value which represents the
	 * nationality of an object.
	 */
	public String getNacionalidad() {
		return this.Nacionalidad;
	}


	/**
	 * This is a Java function that sets the nationality of an object.
	 * 
	 * @param _Nacionalidad _Nacionalidad is a String parameter that represents the nationality of an
	 * object or instance in a Java program. The "setNacionalidad" method is used to set the value of this
	 * parameter for the object.
	 */
	public void setNacionalidad(String _Nacionalidad) {
		this.Nacionalidad = _Nacionalidad;
	}

	/**
	 * This function returns the value of the "Direccion" variable.
	 * 
	 * @return The method `getDireccion()` is returning a `String` value, which is the value of the
	 * instance variable `Direccion`.
	 */
	public String getDireccion() {
		return this.Direccion;
	}


	/**
	 * This is a Java function that sets the value of a variable called "Direccion" to the value passed as
	 * a parameter.
	 * 
	 * @param _Direccion _Direccion is a parameter of type String that represents the new value for the
	 * "Direccion" instance variable. This method sets the value of the "Direccion" instance variable to
	 * the value passed as the parameter.
	 */
	public void setDireccion(String _Direccion) {
		this.Direccion = _Direccion;
	}

	/**
	 * This function returns the email associated with an object.
	 * 
	 * @return The method `getEmail()` is returning the value of the instance variable `Email`.
	 */
	public String getEmail() {
		return this.Email;
	}


	/**
	 * This Java function sets the value of the Email variable.
	 * 
	 * @param _Email The "_Email" parameter is a string variable that represents the email address that
	 * will be set for the object.
	 */
	public void setEmail(String _Email) {
		this.Email = _Email;
	}

	/**
	 * This function returns the value of the "Telefono" variable.
	 * 
	 * @return The method `getTelefono()` is returning a `String` value, which is the value of the
	 * instance variable `Telefono`.
	 */
	public String getTelefono() {
		return this.Telefono;
	}


	/**
	 * This function sets the value of the "Telefono" variable in a Java class.
	 * 
	 * @param _Telefono _Telefono is a parameter of type String that represents the new value for the
	 * "Telefono" attribute of an object. The "setTelefono" method is a setter method that allows you to
	 * update the value of the "Telefono" attribute.
	 */
	public void setTelefono(String _Telefono) {
		this.Telefono = _Telefono;
	}

	/**
	 * This function returns the date of birth of an object.
	 * 
	 * @return The method `getFechaNac()` is returning the `FechaNac` attribute of the object. The data
	 * type of `FechaNac` is not specified in the code snippet, but it is likely to be a `Date` object.
	 */
	public Date getFechaNac() {
		return this.FechaNac;
	}


	/**
	 * This Java function sets the value of the variable "FechaNac" to the input parameter "_FechaNac".
	 * 
	 * @param _FechaNac _FechaNac is a parameter of type Date that is passed to the setFechaNac method. It
	 * represents the date of birth of a person or an object. The method sets the value of the FechaNac
	 * instance variable to the value of the _FechaNac parameter.
	 */
	public void setFechaNac(Date _FechaNac ) {
		this.FechaNac = _FechaNac;
	}

	/**
	 * This Java function returns the ID of a locality.
	 * 
	 * @return The method `getIdLocalidad()` is returning a `String` value which is the name of the
	 * localidad (locality) represented by the object.
	 */
	public String getIdLocalidad() {
		return this.Localidad;
	}


	/**
	 * This is a Java function that sets the value of a variable called "Localidad".
	 * 
	 * @param _Localidad _Localidad is a variable of type String that represents the name of a locality or
	 * city. This method sets the value of the instance variable "Localidad" to the value passed as the
	 * parameter "_Localidad".
	 */
	public void setLocalidad(String _Localidad ) {
		this.Localidad = _Localidad;
	}
}
