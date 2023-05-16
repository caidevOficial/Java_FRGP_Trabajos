package main;

import java.awt.EventQueue;

import negocio.IPersonaNegocio;
import negociodao.PersonaNegocioImple;
import presentacion_controlador.Controlador;
import presentacion_vista.Ventana;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana Frame = new Ventana();
					Frame.setVisible(true);
					
					IPersonaNegocio NegPers = new PersonaNegocioImple();
					
					Controlador controlador = new Controlador(Frame, NegPers);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
