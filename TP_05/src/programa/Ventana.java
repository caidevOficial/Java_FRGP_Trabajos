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

public class Ventana extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<Categorias> LtModel;

	/**
	 * Create the frame.
	 */
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
