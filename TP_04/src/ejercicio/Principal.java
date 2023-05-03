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

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	public String TipoVentana = "Menu";
	public String VentanaActual = "Menu";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */	
	public Principal() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GRUPO NRO: 3");
		lblNewLabel.setBounds(90, 9, 100, 14);
		panel.add(lblNewLabel);
		
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio1 Ejer = new Ejercicio1();
				VentanaActual = "Ejercicio1";
				// NO SE PORQUE SINO LO HAGO INVISIBLE PRIMERO NO SE RE DIBUJA EL PANEL
				contentPane.setVisible(false);
				setContentPane(Ejer);				
				contentPane.setVisible(true);
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				
			}
		});
		btnEjercicio1.setBounds(157, 46, 110, 23);
		panel.add(btnEjercicio1);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.setBounds(157, 114, 110, 23);
		panel.add(btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.setBounds(157, 182, 110, 23);
		panel.add(btnEjercicio3);
		
		//ACA ENTRA CUANDO SE APRETA CERRAR LA VENTANA
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Principal panel = new Principal();				
				if (VentanaActual == panel.TipoVentana) {
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}	
				contentPane.setVisible(false);
				setContentPane(contentPane);
				contentPane.setVisible(true);			
				VentanaActual = "Menu";
			}
		});
		
	}
	
	private int VuelveAPrincipal(JPanel contentPane)
	{
		Principal panel = new Principal();
		 System.out.print("llegue aca 1");
		contentPane.setVisible(false);
		setContentPane(contentPane);
		contentPane.setVisible(true);
		return 1;
	}
	
	

}
