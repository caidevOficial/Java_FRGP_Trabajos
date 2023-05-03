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
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;
	public JLabel MuestraDatos;

	/**
	 * Create the panel.
	 */
	public Ejercicio1() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(90, 39, 46, 14);
		add(lblNewLabel);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(90, 83, 46, 14);
		add(lblApellido);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(90, 130, 66, 14);
		add(lblTelefono);

		JLabel lblFechaNac = new JLabel("Fecha Nac.");
		lblFechaNac.setBounds(90, 173, 67, 14);
		add(lblFechaNac);

		txtNombre = new JTextField();
		txtNombre.setBounds(189, 36, 162, 20);
		add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(189, 80, 162, 20);
		add(txtApellido);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(189, 127, 162, 20);
		add(txtTelefono);

		txtFechaNac = new JTextField();
		txtFechaNac.setColumns(10);
		txtFechaNac.setBounds(189, 173, 162, 20);
		add(txtFechaNac);

		JLabel JLabel = new JLabel("");
		JLabel.setBounds(90, 256, 350, 14);
		add(JLabel);

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() ||
						txtTelefono.getText().isEmpty() || txtFechaNac.getText().isEmpty()) {

					if (txtNombre.getText().isEmpty()) {
						txtNombre.setBackground(Color.red);
					}

					if (txtApellido.getText().isEmpty()) {
						txtApellido.setBackground(Color.red);
					}

					if (txtTelefono.getText().isEmpty()) {
						txtTelefono.setBackground(Color.red);
					}

					if (txtFechaNac.getText().isEmpty()) {
						txtFechaNac.setBackground(Color.red);
					}
				} else {
					JLabel.setText(
							String.format(
									"Los datos ingresados son: %s %s %s %s", txtNombre.getText(), txtApellido.getText(),
									txtTelefono.getText(), txtFechaNac.getText()));

					txtNombre.setText("");
					txtNombre.setBackground(Color.white);
					txtApellido.setText("");
					txtApellido.setBackground(Color.white);
					txtTelefono.setText("");
					txtTelefono.setBackground(Color.white);
					txtFechaNac.setText("");
					txtFechaNac.setBackground(Color.white);
				}

			}
		});
		btnMostrar.setBounds(281, 214, 89, 23);
		add(btnMostrar);

		JLabel LblMostrarDatos = new JLabel();
		LblMostrarDatos.setBounds(281, 250, 20, 20);
		add(LblMostrarDatos);
	}
}
