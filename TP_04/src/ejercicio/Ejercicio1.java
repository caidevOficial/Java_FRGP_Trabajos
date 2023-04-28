package ejercicio;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejercicio1 extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;

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
		lblTelefono.setBounds(90, 130, 46, 14);
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
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(281, 214, 89, 23);
		add(btnMostrar);

	}
}
