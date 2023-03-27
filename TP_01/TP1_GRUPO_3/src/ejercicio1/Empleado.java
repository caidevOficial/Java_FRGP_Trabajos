/**
 * Copyright (C) 2023 <Grupo 3 - UTN FRGP>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ejercicio1;

public class Empleado {

	// ATTRIBUTES
	
	private int id;
	private String nombre;
	private int edad;
	
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
	 * Sets the employee ID
	 * @param id The id of the given employee. Must be an integer. 
	 */
	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		}
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
}
