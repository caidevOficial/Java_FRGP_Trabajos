package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio3 {

	public static void main(String[] args) {
		ArrayList<Edificio> listaEdificios = new ArrayList<Edificio>(5);
	    listaEdificios.add(new Oficina("Apple", 354.4, "50 oficinas"));
	    listaEdificios.add(new Oficina("Amazon", 205.5, "70 Oficinas"));
	    listaEdificios.add(new Polideportivo("El Poli", 700.0, 2));
	    listaEdificios.add(new Polideportivo("Polideportivo Racing", 800.0, 3));
	    listaEdificios.add(new Polideportivo("Club Huracan", 1200.0, 3));
	    
	    ListIterator<Edificio> it = listaEdificios.listIterator();
	    while(it.hasNext()) {
	    	Edificio Edificio = it.next();
	    	it.remove();
	    	System.out.println(Edificio.toString());
	    }
	    
	}

}
