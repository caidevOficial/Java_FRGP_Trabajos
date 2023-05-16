package presentacion_controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import entidad.Persona;
import negocio.IPersonaNegocio;
import negociodao.PersonaNegocioImple;
import presentacion_vista.Pnl_Agregar;
import presentacion_vista.Ventana;

public class Controlador implements ActionListener {
	
	private Ventana VentanaPrincipal;
	private IPersonaNegocio PNeg; 
	
	public Controlador(Ventana VentanaPrincipal, IPersonaNegocio negPers) {
	this.VentanaPrincipal = VentanaPrincipal;
	this.PNeg = negPers;
	this.VentanaPrincipal.getJMenuBar().getMenu(0).getItem(0).addActionListener(a->Poner_PnlAgregar(a));
	//this.VentanaPrincipal.getMenuBar().getMenu(0).getItem(0).addActionListener(a->Poner_PnlAgregar(a));
	
	}

	private void Poner_PnlAgregar(ActionEvent a) {
		JPanel PnlAgregar = new Pnl_Agregar();
		((Pnl_Agregar) PnlAgregar).getTxt_Nombre().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				
				boolean numero = key >= 48 && key <= 57;
				
				if (numero)
				{
					e.consume();
				}
						
			}
		});
		((Pnl_Agregar) PnlAgregar).getTxt_Apellido().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				
				boolean numero = key >= 48 && key <= 57;
				
				if (numero)
				{
					e.consume();
				}
						
			}
		});
		
		((Pnl_Agregar) PnlAgregar).getTxt_Dni().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				
				boolean numero = key >= 48 && key <= 57;
				
				if (!numero)
				{
					e.consume();
				}
						
			}
		});
		((Pnl_Agregar) PnlAgregar).getBtn_Aceptar().addActionListener(i-> GrabarPersona(i));                       
		
		this.VentanaPrincipal.getContentPane().setVisible(false);
		this.VentanaPrincipal.setContentPane(PnlAgregar);
		this.VentanaPrincipal.getContentPane().setVisible(true);
	}

	private void GrabarPersona(ActionEvent i) {
		String Nombre =((Pnl_Agregar) this.VentanaPrincipal.getContentPane()).getTxt_Nombre().getText(); 
		String Apellido = ((Pnl_Agregar) this.VentanaPrincipal.getContentPane()).getTxt_Apellido().getText();
		String Dni = ((Pnl_Agregar) this.VentanaPrincipal.getContentPane()).getTxt_Dni().getText(); 
		if ( Nombre.replace(" ", "").length() != 0)
		{
			if ( Apellido.replace(" ", "").length() != 0)
			{
			
				if (Dni.replace(" ", "").length() != 0)
				{
					
					Persona Per = new Persona(Nombre, Apellido, Dni);
					if (!this.PNeg.ExistePersona(Dni))
					{
						if (this.PNeg.AgregarPersona(Per))
						{
							((Pnl_Agregar) this.VentanaPrincipal.getContentPane()).getTxt_Nombre().setText("");
							((Pnl_Agregar) this.VentanaPrincipal.getContentPane()).getTxt_Apellido().setText("");
							((Pnl_Agregar) this.VentanaPrincipal.getContentPane()).getTxt_Dni().setText("");
							return;	
						}else
						{
							JOptionPane.showMessageDialog(VentanaPrincipal, "No se pudo agregar a la persona.");
							return;
						}
					}
					else {
						JOptionPane.showMessageDialog(VentanaPrincipal, "Ya existe una persona con ese dni.");
						return;
					}
					
						
					
				}
			}
			
		}
		
		JOptionPane.showMessageDialog(VentanaPrincipal, "Es necesario completar todos los campos");
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
