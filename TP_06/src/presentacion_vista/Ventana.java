package presentacion_vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPersona = new JMenu("Persona");
		menuBar.add(mnPersona);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mnPersona.add(mntmAgregar);
		
		JMenuItem mntmModificar = new JMenuItem("Modificar");
		mnPersona.add(mntmModificar);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mnPersona.add(mntmEliminar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mnPersona.add(mntmListar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	

}
