package com.proyecto.core.interfaces;

import java.util.List;
import java.util.Optional;

import com.proyecto.core.model.ProfesionalesEntity;

public interface IProfesionalesServices {
	
	public List<ProfesionalesEntity> mostrarProfesional();
	
	public int crearProfesionales(ProfesionalesEntity Profesionales);
	
	public ProfesionalesEntity buscarProfesionales(int id);
	
	public void borrarProfesionales(int id);
	
	public Optional<ProfesionalesEntity> listarId(int id);

}
