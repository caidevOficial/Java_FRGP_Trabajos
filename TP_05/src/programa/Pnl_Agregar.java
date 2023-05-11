package programa;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dominio.Categorias;
import dominio.Peliculas;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class Pnl_Agregar extends JPanel {
	private JTextField txt_Nombre;
	private JLabel lblNewLabel;
	private  JLabel lbl_ID ;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JComboBox<Categorias> comboBox;
	private JButton btn_Aceptar;
	
	private int CantidadRegistrosActual;
	
		/**
	 * Create the panel.
	 */
	public Pnl_Agregar(int ultimoID) {
		setLayout(null);
		
		lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(61, 43, 46, 14);
		add(lblNewLabel);
		
		lbl_ID = new JLabel(String.valueOf(ultimoID));
		lbl_ID.setBounds(183, 43, 46, 14);
		add(lbl_ID);
		
		lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(61, 97, 46, 14);
		add(lblNewLabel_1);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setBounds(183, 94, 146, 20);
		add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Genero");
		lblNewLabel_2.setBounds(61, 162, 46, 14);
		add(lblNewLabel_2);
		
		comboBox = new JComboBox<Categorias>();
		comboBox.setBounds(183, 159, 146, 20);
		add(comboBox);
		comboBox.addItem(new Categorias("Seleccione un genero"));
		comboBox.addItem(new Categorias("Terror"));
		comboBox.addItem(new Categorias("Accion"));
		comboBox.addItem(new Categorias("Suspeso"));
		comboBox.addItem(new Categorias("Romantica"));
		
		btn_Aceptar = new JButton("Aceptar");
		btn_Aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				LinkedList<Peliculas> listaPeliculas = new LinkedList<Peliculas>();
				Peliculas p1 = new Peliculas();
				
				p1.setId(Integer.parseInt(lbl_ID.getText()));
				p1.setNombre(txt_Nombre.getText());
				Categorias cat = new Categorias(comboBox.getSelectedItem().toString());
				p1.setGenero(cat);
				
				listaPeliculas.add(p1);
				
			}
		});
		btn_Aceptar.setBounds(61, 219, 118, 23);
		add(btn_Aceptar);

	}

}
