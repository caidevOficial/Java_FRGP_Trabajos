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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

/**
 * @author <Grupo 3 - UTN FRGP>
 *
 */
public class mainEjercicio1_b {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/*TreeSet<String> Profesores = new TreeSet<String>();
		
		
		Profesores.add("Thian");
		Profesores.add("Paul");
		Profesores.add("Hadaluz");
		Profesores.add("Evelyn");
			for (String item : Profesores)
		{
			System.out.println(item);
		}
		*/
		
		Profesor p1 = new Profesor("Jirafales", 45, "Historia", 10);
		Profesor p2 = new Profesor("Chavo", 20, "Geografia", 8);
		Profesor p3 = new Profesor("Kiko", 21, "Ed.Fisica", 5);
		Profesor p4 = new Profesor("Chilindrina", 25, "Arte", 6);
		Profesor p5 = new Profesor("DoniaFlorinda", 40, "Matematica", 11);
		
		TreeSet<Profesor> Profesores = new TreeSet<Profesor>();
		Profesores.add(p5);
		Profesores.add(p2);
		Profesores.add(p4);
		Profesores.add(p3);
		Profesores.add(p1);
		
		Iterator<Profesor> it = Profesores.iterator();
			
		while(it.hasNext())
		{
			Profesor aux = it.next();
			System.out.println(aux.toString());
		}
		
	}

}
