package Entidad;


/**
 * The `Usuario` class is a Java class that represents a user with attributes such as DNI, name,
 * password, email, and administrator status.
 */
public class Usuario {

	private String DNI;
	private String Nombre;
	private String Apellido;
	private String Contrase�a;
	private String Email;
	private boolean Administrador;
	
	
	//CONTRUCTORES
	// `public Usuario () {}` is a default constructor for the `Usuario` class that takes no arguments. It
	// initializes a new instance of the class with default values for all its fields.
	public Usuario () {}
	
	
	// This is a constructor for the `Usuario` class that takes in six parameters: `dni`, `Nombre`,
	// `Apellido`, `Contrase�a`, `Email`, and `Administrador`. It initializes a new instance of the class
	// with the values passed in for each parameter. The `this` keyword is used to refer to the instance
	// of the class being created, and the values passed in for each parameter are assigned to the
	// corresponding fields of the instance.
	public Usuario (String dni, String Nombre, String Apellido, String Contrase�a, String Email, boolean Administrador)
	{
		this.DNI = dni;
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Contrase�a = Contrase�a;
		this.Email = Email;
		this.Administrador = Administrador;
	}

	//GETS Y SETS
	/**
	 * The function returns the DNI (identification number) as a string.
	 * 
	 * @return The method `getDNI()` is returning a `String` which represents the DNI (Documento Nacional
	 * de Identidad) of an object.
	 */
	public String getDNI() {
		return this.DNI;
	}


	/**
	 * This Java function sets the value of the DNI variable.
	 * 
	 * @param dNI dNI is a parameter of type String that represents the new value for the DNI (Documento
	 * Nacional de Identidad) attribute of an object. The method sets the DNI attribute to the value
	 * passed as the parameter.
	 */
	public void setDNI(String dNI) {
		this.DNI = dNI;
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
	 * This function returns the value of the "Apellido" variable.
	 * 
	 * @return The method `getApellido()` is returning the value of the instance variable `Apellido`.
	 */
	public String getApellido() {
		return this.Apellido;
	}


	/**
	 * This is a Java function that sets the value of a variable called "Apellido" to the input parameter
	 * "apellido".
	 * 
	 * @param apellido apellido is a variable of type String that represents the last name or surname of a
	 * person. The method setApellido sets the value of the instance variable Apellido to the value passed
	 * as the parameter.
	 */
	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}


	/**
	 * This Java function returns the value of the "Contraseña" variable.
	 * 
	 * @return The method is returning a String value which is the password (Contraseña in Spanish).
	 */
	public String getContrase�a() {
		return this.Contrase�a;
	}


	/**
	 * This Java function sets the value of a variable named "Contraseña" to the value passed as a
	 * parameter.
	 * 
	 * @param contrase The parameter "contraseña" is a string that represents a password. The method
	 * "setContraseña" is a setter method that sets the value of the "Contraseña" instance variable to the
	 * value passed as the parameter "contraseña".
	 */
	public void setContrase�a(String contrase�a) {
		this.Contrase�a = contrase�a;
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
	 * This Java function sets the value of the "Email" variable to the input "email" value.
	 * 
	 * @param email The parameter "email" is a String variable that represents the email address that we
	 * want to set for an object. The method "setEmail" takes this parameter and assigns its value to the
	 * instance variable "Email" of the object.
	 */
	public void setEmail(String email) {
		this.Email = email;
	}


	/**
	 * This function returns a boolean value indicating whether the object is an administrator or not.
	 * 
	 * @return A boolean value representing whether the object is an administrator or not.
	 */
	public boolean isAdministrador() {
		return this.Administrador;
	}

	/**
	 * This Java function sets the value of a boolean variable called "Administrador" to a given boolean
	 * value.
	 * 
	 * @param administrador a boolean variable that represents whether a user is an administrator or not.
	 * The method sets the value of the instance variable "Administrador" to the value of the parameter
	 * "administrador".
	 */
	public void setAdministrador(boolean administrador) {
		this.Administrador = administrador;
	}

	@Override
	// The `toString()` method is overriding the default implementation of the `toString()` method
	// inherited from the `Object` class. It returns a `String` representation of the `Usuario` object.
	public String toString() {
		if (Administrador) {
			return String.format("Usuario Administrador \n%s %s", this.Nombre, this.Apellido);			
		}else{
			return String.format("Usuario Medico \n%s %s", this.Nombre, this.Apellido);
		}
	}
}
