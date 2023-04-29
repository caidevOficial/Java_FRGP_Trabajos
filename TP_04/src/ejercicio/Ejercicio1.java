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
		
		JLabel JLabel = new JLabel("");
		JLabel.setBounds(90, 256, 350, 14);
		add(JLabel);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtNombre.getText().equals("") || 
				   txtApellido.getText().equals("") || 
				   txtTelefono.getText().equals("") ||
			       txtFechaNac.getText().equals("")) 
				{
					if(txtNombre.getText().equals("")) 
					{
						txtNombre.setBackground(Color.red);						
					}
					
					if(txtApellido.getText().equals("")) 
					{
						txtApellido.setBackground(Color.red);						
					}
					
					if(txtTelefono.getText().equals("")) 
					{
						txtTelefono.setBackground(Color.red);						
					}
					
					if(txtFechaNac.getText().equals("")) 
					{
						txtFechaNac.setBackground(Color.red);						
					}
				}
				
				else {
					
					JLabel.setText("Los datos ingresados son: " + txtNombre.getText() + 
							txtApellido.getText() +  " " + txtTelefono.getText() + " " + txtFechaNac.getText());		
					
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
