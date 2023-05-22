package presentacion_vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class Pnl_Eliminar extends JPanel {
	
	JButton btnNewButton;
	JLabel lblNewLabel;
	JList list;
	


	public Pnl_Eliminar() 
	{
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(170, 266, 89, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(178, 11, 94, 14);
		add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(57, 49, 331, 197);
		add(list);
		

	}

	
	public void initialize() {
		setLayout(null);
		
	
	}
}
