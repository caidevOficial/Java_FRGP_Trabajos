package ejercicio2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductoFresco extends Producto{
	private Date fechaEnvasado;	
	private String paisOrigen;
	
	
	public ProductoFresco(Date fechaCaducidad, int lote, Date fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, lote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	public Date getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(Date fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	
	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
		String strDate = dateFormat.format(this.fechaEnvasado);  
		
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("\n");
		mensaje.append("*************************\n");
		mensaje.append("PRODUCTO FRESCO\n");
		mensaje.append(super.toString());
		mensaje.append("* F. Envasado: "+ strDate +"\n");
		mensaje.append("* Origen  : "+ this.paisOrigen +" \n");	
		mensaje.append("*************************\n");
		
		return mensaje.toString();		
	}
}
