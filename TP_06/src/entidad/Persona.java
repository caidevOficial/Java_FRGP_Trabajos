/**
 * MIT License
 *
 * Copyright (C) 2023 <Grupo 3 - UTN FRGP>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

 package entidad;

/**
 * The class "Persona" defines a person with a name, last name, and DNI (identification number) with
 * getters and setters for each attribute.
 */
public class Persona {

	private String Nombre;
	private String Apellido;
	private String Dni;
	
	/**
	 * This is a constructor method for the `Persona` class that takes three parameters: 
	 * @param `nom` (representing the person's first name)
	 * @param `Ape` (representing the person's last name).
	 * @param `Dni` (representing the person's identification number). 
	 * The constructor initializes the instance variables `Nombre`, `Apellido`, 
	 * and `Dni` with the values passed as parameters.
	 */
	public Persona(String nom, String Ape, String Dni){
		this.Nombre = nom;	
		this.Apellido = Ape;			
		this.Dni = Dni;
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
	 * @param apellido The parameter "apellido" is a String variable that represents the last name or
	 * surname of a person. The method "setApellido" sets the value of the instance variable "Apellido" to
	 * the value passed as the parameter "apellido".
	 */
	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}

	/**
	 * The function returns the DNI (identification number) as a string.
	 * 
	 * @return The method `getDni()` is returning a `String` value, which is the `Dni` attribute of the
	 * object.
	 */
	public String getDni() {
		return this.Dni;
	}

	/**
	 * This Java function sets the value of the Dni variable to the input parameter dni.
	 * 
	 * @param dni The parameter "dni" is a String representing the DNI (Documento Nacional de Identidad)
	 * of a person. The method "setDni" sets the value of the DNI attribute of an object to the value
	 * passed as the "dni" parameter.
	 */
	public void setDni(String dni) {
		this.Dni = dni;
	}
}
