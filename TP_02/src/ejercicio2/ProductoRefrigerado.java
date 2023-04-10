package ejercicio2;

import java.util.Date;

public class ProductoRefrigerado extends Producto {

	private String CodigoOrganismoSup;
	
	
	public ProductoRefrigerado(Date fechaCaducidad, int lote, String codigoOrganismoSup) {
		super(fechaCaducidad, lote);
		CodigoOrganismoSup = codigoOrganismoSup;
	}



	public String getCodigoOrganismoSup() {
		return CodigoOrganismoSup;
	}
	public void setCodigoOrganismoSup(String codigoOrganismoSup) {
		CodigoOrganismoSup = codigoOrganismoSup;
	}



	@Override
	public String toString() {
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("\n");
		mensaje.append("*************************\n");
		mensaje.append("PRODUCTO REFRIGERADO\n");
		mensaje.append(super.toString());
		mensaje.append("* Cod. Org. Supervisión: "+this.CodigoOrganismoSup +"\n");			
		mensaje.append("*************************\n");
		
		return mensaje.toString();		
	}
	
}
