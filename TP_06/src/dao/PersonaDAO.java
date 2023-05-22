package dao;

import java.util.List;

import entidad.Persona;

public interface PersonaDAO {

	public boolean insert(Persona per);
	public boolean delete(Persona perDelete);
	public List<Persona> readAll();
}
