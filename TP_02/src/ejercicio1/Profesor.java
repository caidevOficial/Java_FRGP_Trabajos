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

/**
 * 
 */
package ejercicio1;

/**
 * @author <Grupo 3 - UTN FRGP>
 *
 */
public class Profesor extends Empleado{

	private String cargo;
	private int antiguedadDocente;
	
	/**
	 * Constructor of the class Employee with four parameters.
	 * @param nombre The teacher name.
	 * @param edad The teacher age, should be an integer.
	 * @param cargo The teacher position.
	 * @param antiguedadDocente The teacher seniority, should be a positive integer.
	 */
	
	public Profesor() {
		super();
		this.setCargo("SinCargo");
		this.setAntiguedadDocente(0);
	}
	
	
	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
		super(nombre, edad);
		this.setCargo(cargo);
		this.setAntiguedadDocente(antiguedadDocente);
	}
	
	/**
	 * @return the teacher position as a string.
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @return the teacher seniority as an integer.
	 */
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	/**
	 * @param cargo the job position to set, 
	 * 		  if the parameter is empty, "Ninguno" will be setted.
	 */
	public void setCargo(String cargo) {
		if(!cargo.isEmpty()) {
			this.cargo = cargo;
		}else {
			this.cargo = "Ninguno";
		}
	}

	/**
	 * @param antiguedadDocente the teacher seniority to set, 
	 * 		  if the parameter is minor than 0, 0 will be setted.
	 */
	public void setAntiguedadDocente(int antiguedadDocente) {
		if(antiguedadDocente > 0) {
			this.antiguedadDocente = antiguedadDocente;
		}else {
			this.antiguedadDocente = 0;
		}
	}

	
	/**
	 * Creates a string with the entire info of the object attributes.
	 * @return The message with the info of the object attributes as a string.
	 */
	@Override
	public String toString() {
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("*************************\n");
		mensaje.append("* Legajo: "+this.getId()+". \n");
		mensaje.append("* Nombre: "+this.getNombre()+".\n");
		mensaje.append("* Edad  : "+this.getEdad()+", \n");
		mensaje.append("* Cargo  : "+this.getCargo()+", \n");
		mensaje.append("* Antiguedad  : "+this.getAntiguedadDocente()+", \n");
		
		return mensaje.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + antiguedadDocente;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}
	
	
	

}
