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

 package negocio;

import entidad.Persona;

/**
 * This is a Java interface called "IPersonaNegocio" that defines 
 * two methods: "AgregarPersona" and "ExistePersona". 
 */ 
public interface IPersonaNegocio {

	/**
	 * The function "AgregarPersona" adds a person to a collection and returns a boolean value indicating
	 * whether the operation was successful or not.
	 * 
	 * @param Perso The parameter "Perso" is an object of the class "Persona" that is being passed as an
	 * argument to the method "AgregarPersona". The method is likely designed to add a new instance of the
	 * "Persona" class to some sort of data structure or database. The boolean return type suggests that
	 * @return A boolean value is being returned.
	 */
	public boolean AgregarPersona(Persona Perso);

	/**
	 * The function checks if a person with a given ID number (DNI) exists.
	 * 
	 * @param dni The parameter "dni" is most likely a String variable that represents a person's
	 * identification number, such as a national identification number or passport number. The method
	 * "ExistePersona" is likely checking if a person with the given identification number already exists
	 * in a database or list. The method returns a boolean
	 * @return A boolean value is being returned, which indicates whether a person with the given DNI
	 * (Spanish identification number) exists or not.
	 */
	public boolean ExistePersona(String dni);
	
	
	public boolean delete(Persona persona_a_eliminar);
	
	
	
}
