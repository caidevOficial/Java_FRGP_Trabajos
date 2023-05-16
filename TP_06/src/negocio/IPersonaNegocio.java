package negocio;

import entidad.Persona;

public interface IPersonaNegocio {

	public boolean AgregarPersona(Persona Perso);

	public boolean ExistePersona(String dni);
	
}
