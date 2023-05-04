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

package ejercicio;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Menu extends JPanel {

	/**
	 * Create the panel.
	 */
	public Menu() {
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setLayout(null);
		add(panel, BorderLayout.CENTER);

		JButton btnEjercicio1 = new JButton("Ejercicio 1");

		btnEjercicio1.setBounds(157, 46, 110, 23);
		panel.add(btnEjercicio1);

		JButton button_1 = new JButton("Ejercicio 2");
		button_1.setBounds(157, 114, 110, 23);
		panel.add(button_1);

		JButton button_2 = new JButton("Ejercicio 3");
		button_2.setBounds(157, 182, 110, 23);
		panel.add(button_2);
		
	}

}
