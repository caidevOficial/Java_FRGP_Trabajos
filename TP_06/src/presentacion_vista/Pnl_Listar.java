/**
 * MIT License
 *
 * Copyright (C) 2023 <Grupo 3 - UTN FRGP>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

 package presentacion_vista;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import entidad.Persona;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * The "Ventana" class creates a JFrame with a JMenuBar containing options for adding, modifying,
 * deleting, and listing "Persona" objects.
 */
public class Pnl_Listar extends JFrame {


	private JTable table;
	private DefaultTableModel tablaModel;
	
	private String [] Columnas ={"DNI","Nombre","Apellido"};
	
	private DefaultTableModel modelPersonas;
	
	public Pnl_Listar() 
	{
		setLayout(null);
		
		JScrollPane spPersonas = new JScrollPane();
		spPersonas.setBounds(15, 30, 383, 234);
		add(spPersonas);
		
		modelPersonas = new DefaultTableModel(null,Columnas);
		table= new JTable(modelPersonas);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(103);
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(97);
		table.getColumnModel().getColumn(2).setResizable(false);
		
		spPersonas.setViewportView(table);
	}
	
	public JTable getTable() {
		return table;
	}
	
	
	public void setTable(JTable table) {
		this.table = table;
	}
	
	
	public DefaultTableModel getTablaModel() {
		return tablaModel;
	}
	
	
	public void setTablaModel(DefaultTableModel tablaModel) {
		this.tablaModel = tablaModel;
	}
	
	
	public String[] getColumnas() {
		return Columnas;
	}
	
	
	public void setColumnas(String[] columnas) {
		Columnas = columnas;
	}
	
	
	public DefaultTableModel getModelPersonas() {
		return modelPersonas;
	}
	
	
	public void setModelPersonas(DefaultTableModel modelPersonas) {
		this.modelPersonas = modelPersonas;
	}
	
	
	public void llenarTabla(List<Persona> list) {
		
		/*
			String columnas[] = {"DNI","Nombre","Apellido"};
		
		tablaModel= new DefaultTableModel(columnas,0);
		


		
		for (int i = 0; i < list.size(); i++) {
			
			tablaModel.addRow(new Object [] {list.get(i).getDNI(),list.get(i).getNombre(),list.get(i).getApellido()});
		}
		
		table = new JTable(tablaModel);
		
		*/
			

			
				this.getModelPersonas().setRowCount(0); //Para vaciar la tabla
				this.getModelPersonas().setColumnCount(0);
				this.getModelPersonas().setColumnIdentifiers(this.getColumnas());

				for (Persona p : list)
				{
					String nombre = p.getNombre();
					String Apellido = p.getApellido();
					String dni = p.getDni();
					Object[] fila = {dni,nombre,Apellido};
					this.getModelPersonas().addRow(fila);
				}			
		
		}
	
}
