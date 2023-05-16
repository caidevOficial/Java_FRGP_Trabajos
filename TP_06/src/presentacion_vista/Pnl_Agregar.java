package presentacion_vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Pnl_Agregar extends JPanel {
	private JTextField txt_Nombre;
	private JTextField txt_Apellido;
	private JTextField txt_Dni;
	private JButton btn_Aceptar;
		/**
	 * Create the panel.
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
		
		btn_Aceptar = new JButton("Aceptar");
		btn_Aceptar.setBounds(75, 209, 89, 23);
		add(btn_Aceptar);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setBounds(172, 38, 86, 20);
		add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		txt_Apellido = new JTextField();
		txt_Apellido.setBounds(173, 89, 86, 20);
		add(txt_Apellido);
		txt_Apellido.setColumns(10);
		
		txt_Dni = new JTextField();
		txt_Dni.setBounds(172, 141, 86, 20);
		add(txt_Dni);
		txt_Dni.setColumns(10);

	}

		public JTextField getTxt_Nombre() {
			return txt_Nombre;
		}

		public void setTxt_Nombre(JTextField txt_Nombre) {
			this.txt_Nombre = txt_Nombre;
		}

		public JTextField getTxt_Apellido() {
			return txt_Apellido;
		}

		public void setTxt_Apellido(JTextField txt_Apellido) {
			this.txt_Apellido = txt_Apellido;
		}

		public JTextField getTxt_Dni() {
			return txt_Dni;
		}

		public void setTxt_Dni(JTextField txt_Dni) {
			this.txt_Dni = txt_Dni;
		}

		public JButton getBtn_Aceptar() {
			return btn_Aceptar;
		}

		public void setBtn_Aceptar(JButton btn_Aceptar) {
			this.btn_Aceptar = btn_Aceptar;
		}
	
		
	
}
