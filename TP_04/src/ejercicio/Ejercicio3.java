package ejercicio;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Canvas;
import java.awt.SystemColor;

public class Ejercicio3 extends JPanel {
	public Ejercicio3() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		
		JLabel lblElijeTuSistema = new JLabel("Elije tu sistema operativo");
		lblElijeTuSistema.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblElijeTuSistema.setBounds(28, 13, 164, 28);
		panel.add(lblElijeTuSistema);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(200, 15, 81, 25);
		panel.add(rdbtnWindows);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(285, 15, 56, 25);
		panel.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(345, 15, 63, 25);
		panel.add(rdbtnLinux);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programacion");
		chckbxProgramacion.setBounds(200, 58, 113, 25);
		panel.add(chckbxProgramacion);
		
		JCheckBox chckbxAdministracin = new JCheckBox("Administraci\u00F3n");
		chckbxAdministracin.setBounds(200, 107, 113, 25);
		panel.add(chckbxAdministracin);
		
		JCheckBox chckbxDiseoGrfico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDiseoGrfico.setBounds(200, 154, 113, 25);
		panel.add(chckbxDiseoGrfico);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad");
		lblElijeUnaEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblElijeUnaEspecialidad.setBounds(28, 111, 158, 16);
		panel.add(lblElijeUnaEspecialidad);
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador: ");
		lblCantidadDeHoras.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCantidadDeHoras.setBounds(28, 188, 247, 28);
		panel.add(lblCantidadDeHoras);
		
		textField = new JTextField();
		textField.setBounds(292, 191, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(311, 246, 97, 25);
		panel.add(btnAceptar);
		
		
	}
	
	private JTextField txtHoras;
	private JTextField textField;
}
