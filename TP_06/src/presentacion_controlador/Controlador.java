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

 package presentacion_controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import entidad.Persona;
import negocio.IPersonaNegocio;
import presentacion_vista.Pnl_Agregar;
import presentacion_vista.Ventana;

/**
 * This is a Java class that serves as a controller for a GUI application, allowing users to add new
 * people to a database and validating user input.
 */
public class Controlador implements ActionListener {
	
	private Ventana VentanaPrincipal;
	private IPersonaNegocio PNeg; 
	
	public Controlador(Ventana VentanaPrincipal, IPersonaNegocio negPers) {
	this.VentanaPrincipal = VentanaPrincipal;
	this.PNeg = negPers;
	this.VentanaPrincipal.getJMenuBar().getMenu(0).getItem(0).addActionListener(a->Poner_PnlAgregar(a));
	//this.VentanaPrincipal.getMenuBar().getMenu(0).getItem(0).addActionListener(a->Poner_PnlAgregar(a));
	
	}

	private void Poner_PnlAgregar(ActionEvent a) {
		JPanel PnlAgregar = new Pnl_Agregar();
		((Pnl_Agregar) PnlAgregar).getTxt_Nombre().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				
				boolean numero = key >= 48 && key <= 57;
				
				if (numero){
					e.consume();
				}
						
			}
		});
		((Pnl_Agregar) PnlAgregar).getTxt_Apellido().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				boolean numero = key >= 48 && key <= 57;
				
				if (numero){
					e.consume();
				}
			}
		});
		
		((Pnl_Agregar) PnlAgregar).getTxt_Dni().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				
				boolean numero = key >= 48 && key <= 57;
				
				if (!numero){
					e.consume();
				}
			}
		});
		((Pnl_Agregar) PnlAgregar).getBtn_Aceptar().addActionListener(i-> GrabarPersona(i));                       
		
		this.VentanaPrincipal.getContentPane().setVisible(false);
		this.VentanaPrincipal.setContentPane(PnlAgregar);
		this.VentanaPrincipal.getContentPane().setVisible(true);
	}

	/**
	 * This function adds a new person to a list if all required fields are filled and the person does not
	 * already exist in the list.
	 * 
	 * @param i The parameter "i" is an ActionEvent object, which is typically used to represent an action
	 * that occurred, such as a button click. However, in this method, the parameter is not used.
	 */
	private void GrabarPersona(ActionEvent i) {
		String Nombre =((Pnl_Agregar) this.VentanaPrincipal.getContentPane()).getTxt_Nombre().getText(); 
		String Apellido = ((Pnl_Agregar) this.VentanaPrincipal.getContentPane()).getTxt_Apellido().getText();
		String Dni = ((Pnl_Agregar) this.VentanaPrincipal.getContentPane()).getTxt_Dni().getText(); 
		
		if(Nombre.isEmpty() && Apellido.isEmpty() && Dni.isEmpty()){
			Persona Per = new Persona(Nombre, Apellido, Dni);
			if (!this.PNeg.ExistePersona(Dni)){
				if (this.PNeg.AgregarPersona(Per)){
					((Pnl_Agregar) this.VentanaPrincipal.getContentPane()).getTxt_Nombre().setText("");
					((Pnl_Agregar) this.VentanaPrincipal.getContentPane()).getTxt_Apellido().setText("");
					((Pnl_Agregar) this.VentanaPrincipal.getContentPane()).getTxt_Dni().setText("");
					return;	
				} else {
					JOptionPane.showMessageDialog(VentanaPrincipal, "No se pudo agregar a la persona.");
					return;
				}
			}
			else {
				JOptionPane.showMessageDialog(VentanaPrincipal, "Ya existe una persona con ese dni.");
				return;
			}
		}
		
		JOptionPane.showMessageDialog(VentanaPrincipal, "Es necesario completar todos los campos");
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
