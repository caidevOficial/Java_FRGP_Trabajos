package ejercicio2;

import java.util.Date;

public class ProductoCongelado extends Producto {

	private double TempCongRecom;

	
	public ProductoCongelado(Date fechaCadu, int Lote,double tempCongRecom) {
		super(fechaCadu, Lote);
		TempCongRecom = tempCongRecom;
	}	
	

	public double getTempCongRecom() {
		return TempCongRecom;
	}

	public void setTempCongRecom(double tempCongRecom) {
		TempCongRecom = tempCongRecom;
	}
	
	
	

	@Override
	public String toString() {
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("\n");
		mensaje.append("*************************\n");
		mensaje.append("PRODUCTO CONGELADO\n");
		mensaje.append(super.toString());
		mensaje.append("Temp. Cong. Recom.:" + this.TempCongRecom + "\n");
		mensaje.append("*************************\n");
		
		return mensaje.toString();
		
	}
	
	
	
	
}
