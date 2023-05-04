package ejercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;

import sun.awt.WindowClosingListener;

import javax.swing.Box;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;
	private double TotalNotas = 0;
	private double promedio = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 416, 419);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pNotasEstudiante = new JPanel();
		pNotasEstudiante.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Notas del Estudiante", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pNotasEstudiante.setBounds(10, 45, 260, 200);
		contentPane.add(pNotasEstudiante);
		pNotasEstudiante.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(38, 36, 46, 14);
		pNotasEstudiante.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(38, 78, 46, 14);
		pNotasEstudiante.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(38, 116, 46, 14);
		pNotasEstudiante.add(lblNota3);
		
		JLabel lblTps = new JLabel("TPS:");
		lblTps.setBounds(38, 150, 46, 14);
		pNotasEstudiante.add(lblTps);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(106, 33, 131, 20);
		pNotasEstudiante.add(txtNota1);
		txtNota1.addKeyListener(new KeyPress(txtNota1));
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(106, 75, 131, 20);
		txtNota2.addKeyListener(new KeyPress(txtNota2));
		txtNota2.setColumns(10);
		pNotasEstudiante.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(106, 113, 131, 20);
		txtNota3.addKeyListener(new KeyPress(txtNota3));
		txtNota3.setColumns(10);
		pNotasEstudiante.add(txtNota3);
		
		JComboBox CboTps = new JComboBox();
		CboTps.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		CboTps.setBounds(106, 147, 131, 20);
		pNotasEstudiante.add(CboTps);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Notas del Estudiante", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 256, 260, 104);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtPromedio = new JTextField();
		txtPromedio.setColumns(10);
		txtPromedio.setBounds(107, 32, 131, 20);
		panel.add(txtPromedio);
		
		txtCondicion = new JTextField();
		txtCondicion.setColumns(10);
		txtCondicion.setBounds(107, 63, 131, 20);
		panel.add(txtCondicion);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(25, 35, 59, 14);
		panel.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(25, 66, 59, 14);
		panel.add(lblCondicion);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Close();
			}
		});
		btnSalir.setBounds(280, 198, 109, 47);
		contentPane.add(btnSalir);
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNota1.setText("");
				txtNota2.setText("");
				txtNota3.setText("");
				txtPromedio.setText("");
				txtCondicion.setText("");
				CboTps.setSelectedIndex(0);	
			}
		});
		btnNuevo.setBounds(280, 151, 109, 47);
		contentPane.add(btnNuevo);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtPromedio.setText(Promedio());
				txtCondicion.setText(Condicion(CboTps.getSelectedItem().toString()));
				
			}
		});
		btnCalcular.setBounds(280, 104, 109, 47);
		contentPane.add(btnCalcular);
	}
	
	public String Promedio()
	{
		double Nota1=0,Nota2=0,Nota3=0;
		
     	Nota1 = Double.parseDouble(txtNota1.getText());
		Nota2 = Double.parseDouble(txtNota2.getText());
		Nota3 = Double.parseDouble(txtNota3.getText());
		 TotalNotas = Nota1+Nota2+Nota3;
		 promedio = TotalNotas / 3;
		 
		 return Double.toString(promedio);
	}
	
	public String Condicion(String CboText)
	{
			String condicion = "";	
			if(CboText == "Aprobado")
			{		
		if (!(Double.parseDouble(txtNota1.getText()) > 6 && Double.parseDouble(txtNota2.getText()) > 6 &&  Double.parseDouble(txtNota3.getText()) > 6))
		{
			return "Libre";
		}
		if (Double.parseDouble(txtNota1.getText()) > 6 && Double.parseDouble(txtNota2.getText()) > 6 &&  Double.parseDouble(txtNota3.getText()) > 6)
		{
			condicion = "Regular";
		}
		if (Double.parseDouble(txtNota1.getText()) >= 8 && Double.parseDouble(txtNota2.getText()) >= 8 &&  Double.parseDouble(txtNota3.getText()) >= 8)
		{
			condicion = "Promocionado";
		}
		return condicion;
			}
		
			return "Libre";
	}
	
	public void Close()
	{
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}
}

class KeyPress implements KeyListener
{
	JTextField textField;
	
	public KeyPress (JTextField txt)
	{
		textField = txt;
		
	}
	public KeyPress ()
	{	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		/*char c = e.getKeyChar();
		if(!Character.isDigit(c))
		{
			e.consume();
		}*/
		    char c = e.getKeyChar();
		    if (!((c >= '0' && c <= '9') || c == '.' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		        e.consume();
		    } else if (c == '.' && textField.getText().contains(".")) {
		        e.consume();
		    }
		

	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}


