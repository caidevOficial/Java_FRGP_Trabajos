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
