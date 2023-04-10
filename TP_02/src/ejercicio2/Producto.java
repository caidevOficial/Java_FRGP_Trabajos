package ejercicio2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Producto {

	
	private Date fechaCaducidad;
	private int Lote;
	
	
	public Producto(Date fechaCaducidad, int lote) {	
		this.fechaCaducidad = fechaCaducidad;
		Lote = lote;		
	}
	
	
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	public int getLote() {
		return Lote;
	}
	public void setLote(int lote) {
		Lote = lote;
	}
	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
		String strDate = dateFormat.format(this.fechaCaducidad);  
		
		StringBuilder mensaje = new StringBuilder();			
		mensaje.append("*************************\n");
		mensaje.append("* F. Caducidad: "+ strDate +"\n");
		mensaje.append("* Lote  : "+this.Lote+" \n");		
		
		return mensaje.toString();
		//return "Fecha de Caducidad: " + fechaCaducidad + " Lote: " + Lote + " ";
	}
	
}
