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

 package presentacion_vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * The Pnl_Agregar class is a JPanel used for adding new data to a system, containing text fields for
 * name, last name, and DNI, as well as an "Aceptar" button.
 */
public class Pnl_Agregar extends JPanel {
	private JTextField txt_Nombre;
	private JTextField txt_Apellido;
	private JTextField txt_Dni;
	private JButton btn_Aceptar;
	
	/**
	 * This is the constructor method for the `Pnl_Agregar` class, which is a JPanel used for adding new
	 * data to a system.
	 */ 
	public Pnl_Agregar() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(80, 43, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(81, 90, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dni");
		lblNewLabel_2.setBounds(77, 142, 46, 14);
		add(lblNewLabel_2);
		
		this.btn_Aceptar = new JButton("Aceptar");
		this.btn_Aceptar.setBounds(75, 209, 89, 23);
		add(this.btn_Aceptar);
		
		this.txt_Nombre = new JTextField();
		this.txt_Nombre.setBounds(172, 38, 86, 20);
		add(this.txt_Nombre);
		this.txt_Nombre.setColumns(10);
		
		this.txt_Apellido = new JTextField();
		this.txt_Apellido.setBounds(173, 89, 86, 20);
		add(this.txt_Apellido);
		this.txt_Apellido.setColumns(10);
		
		this.txt_Dni = new JTextField();
		this.txt_Dni.setBounds(172, 141, 86, 20);
		add(this.txt_Dni);
		this.txt_Dni.setColumns(10);

	}

	/**
	 * This function returns a JTextField object named "txt_Nombre".
	 * 
	 * @return A JTextField object named "txt_Nombre".
	 */
	public JTextField getTxt_Nombre() {
		return this.txt_Nombre;
	}

	/**
	 * This function sets the value of a JTextField object named "txt_Nombre".
	 * 
	 * @param txt_Nombre A JTextField object that represents a text field component in a graphical user
	 * interface. This method sets the value of the instance variable "txt_Nombre" to the value of the
	 * parameter "txt_Nombre".
	 */
	public void setTxt_Nombre(JTextField txt_Nombre) {
		this.txt_Nombre = txt_Nombre;
	}

	/**
	 * This function returns a JTextField object for the "Apellido" field.
	 * 
	 * @return A JTextField object named "txt_Apellido".
	 */
	public JTextField getTxt_Apellido() {
		return this.txt_Apellido;
	}

	/**
	 * This function sets the value of a JTextField variable called txt_Apellido.
	 * 
	 * @param txt_Apellido This is a parameter of type JTextField that is being passed to the method
	 * setTxt_Apellido. The method is likely part of a class and is used to set the value of the instance
	 * variable txt_Apellido to the value of the parameter being passed in.
	 */
	public void setTxt_Apellido(JTextField txt_Apellido) {
		this.txt_Apellido = txt_Apellido;
	}

	/**
	 * This function returns a JTextField object named "txt_Dni".
	 * 
	 * @return A JTextField object named "txt_Dni".
	 */
	public JTextField getTxt_Dni() {
		return this.txt_Dni;
	}

	/**
	 * This function sets the value of a JTextField variable called txt_Dni.
	 * 
	 * @param txt_Dni The parameter txt_Dni is a JTextField object that is being passed to the method
	 * setTxt_Dni(). This method is likely part of a class that has a JTextField instance variable named
	 * txt_Dni, and this method is used to set the value of that variable to the value of the parameter
	 * being passed
	 */
	public void setTxt_Dni(JTextField txt_Dni) {
		this.txt_Dni = txt_Dni;
	}

	/**
	 * This function returns the JButton object for the "Aceptar" button.
	 * 
	 * @return The method `getBtn_Aceptar()` is returning a `JButton` object.
	 */
	public JButton getBtn_Aceptar() {
		return this.btn_Aceptar;
	}

	/**
	 * This function sets the "btn_Aceptar" JButton in a Java program.
	 * 
	 * @param btn_Aceptar The parameter `btn_Aceptar` is a JButton object that is being passed to the
	 * `setBtn_Aceptar` method. This method sets the value of the `btn_Aceptar` instance variable of the
	 * class to the value of the `btn_Aceptar` parameter. This allows other methods in the
	 */
	public void setBtn_Aceptar(JButton btn_Aceptar) {
		this.btn_Aceptar = btn_Aceptar;
	}
}
