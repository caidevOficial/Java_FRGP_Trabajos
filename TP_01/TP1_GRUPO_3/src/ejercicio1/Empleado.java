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

package ejercicio1;

public class Empleado {

	// ATTRIBUTES
	
	private final int id;
	private String nombre;
	private int edad;
	
	
	//ATRIBUTO DE LA CLASE 
	static int cont = 0;
	static int baseID = 1000;
	
	
	//CONSTRUCTORES
	
	/**
	 * Constructor of the Employee class, initializes the object with "Sin Nombre" as a name
	 * and 99 as an age.
	 */
	public Empleado(){
		this("Sin Nombre", 99);
	}
	
	/**
	 * Constructor of the class Employee with two parameters.
	 * @param Nombre The employee name.
	 * @param Edad The employee age, should be an integer.
	 */
	public Empleado(String nombre, int edad){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.id = baseID + cont;
		cont++;
	}
	
	// GETTERS AND SETTERS
	
	/**
	 * Gets the employee ID
	 * @return the employee ID as an integer.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Gets the employee name.
	 * @return The employee name as a string.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Gets the employee age.
	 * @return The employee age as an integer.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Sets the employee name.
	 * @param nombre The employee name as a string.
	 */
	public void setNombre(String nombre) {
		if(!nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Sets the employee age.
	 * @param edad The age of the employee, as an integer.
	 */
	public void setEdad(int edad) {
		if(edad > 0) {
			this.edad = edad;
		}
	}
	
	
	/**
	 * Gets a message that indicates the next available ID for the employee.
	 */
	public static void devuelveProximoID() {
		System.out.println("El proximo ID sera: " + (baseID + cont));
	}
	
	
	/**
	 * Creates a string with the entire info of the object attributes.
	 * @return The message with the info of the object attributes as a string.
	 */
	public String toString() {
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("*************************\n");
		mensaje.append("* Nombre: "+this.nombre+".\n");
		mensaje.append("* Edad  : "+this.edad+", \n");
		mensaje.append("* Legajo: "+this.id+". \n");
		mensaje.append("*************************\n");
		
		return mensaje.toString();
	}
}
