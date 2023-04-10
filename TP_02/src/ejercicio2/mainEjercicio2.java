package ejercicio2;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class mainEjercicio2 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args)
	{
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
					
		ArrayList<Producto> Productos = new ArrayList<Producto>(3);
		
		//Agrego producto Congelado
		LocalDate fecha = LocalDate.parse("17/10/2023", formato);
		Productos.add(new ProductoCongelado(Date.valueOf(fecha),1234,-17));
		
		//Agrego producto fresco		
		fecha = LocalDate.parse("23/03/2023", formato);
		LocalDate fecha2 = LocalDate.parse("15/12/2022", formato);
		Productos.add(new ProductoFresco(Date.valueOf(fecha),1505,Date.valueOf(fecha2),"Argentina"));
		
		//Agrego producto Refrigerado
		fecha = LocalDate.parse("10/04/2023", formato);		
		Productos.add(new ProductoRefrigerado(Date.valueOf(fecha), 2006,"018412764-4"));
		
		
		for (Producto item : Productos)
		{
			System.out.println(item.toString());
		}
		
	}
}
