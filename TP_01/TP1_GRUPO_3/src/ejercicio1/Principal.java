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

import java.util.LinkedList;
import java.util.List;

import ejercicio1.Empleado;

/**
 * @author <Grupo 3 - UTN FRGP>
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Empleado> empleados = new LinkedList<Empleado>();
		
		for(int index = 0; index < 4; index++) {
			if(empleados.isEmpty()) {
				empleados.add(new Empleado());
			} else {
				int edad_random = (int)(Math.random() * 50 + 1);
				empleados.add(new Empleado("Empleado_" + index, edad_random));
			}
		}
		
		for(int index = 0; index < 4; index++) {
			System.out.println(empleados.get(index).toString());
		}
		
		Empleado.devuelveProximoID();
	}

}
