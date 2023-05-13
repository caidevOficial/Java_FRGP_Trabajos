package programa;

import java.awt.BorderLayout;
import dominio.Categorias;
import java.awt.EventQueue;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * The `Ventana` class is a JFrame that contains a JMenuBar with a JMenu called "Peliculas" and two
 * JMenuItems, "Agregar" and "Listar", with the former creating a new `Pnl_Agregar` object and setting
 * it as the content pane of the JFrame.
 */
public class Ventana extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<Categorias> LtModel;

	// This is the constructor method for the `Ventana` class. It initializes a `DefaultListModel` object
	// called `LtModel`, sets the default close operation for the JFrame, sets the size and position of
	// the JFrame, creates a JMenuBar and adds a JMenu called "Peliculas" to it. It also adds two
	// JMenuItems to the "Peliculas" menu, one called "Agregar" and the other called "Listar". The
	// "Agregar" JMenuItem has an ActionListener that creates a new `Pnl_Agregar` object and sets it as
	// the content pane of the JFrame. Finally, it creates a new JPanel called `contentPane`, sets its
	// border and layout, and sets it as the content pane of the JFrame.
	public Ventana() {
		
		LtModel = new DefaultListModel<Categorias>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 336);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pnl_Agregar Agregar = new Pnl_Agregar(LtModel.size() + 1);				
				contentPane.setVisible(false);
				setContentPane(Agregar);				
				contentPane.setVisible(true);
				
			}
		});
		mnPeliculas.add(mntmAgregar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mnPeliculas.add(mntmListar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
