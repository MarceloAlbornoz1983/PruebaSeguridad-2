package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.ProfesionalesRepository;
import com.proyecto.core.interfaces.IProfesionalesServices;
import com.proyecto.core.model.ProfesionalesEntity;

@Service
public class ProfesionalesService implements IProfesionalesServices {

	@Autowired
	public ProfesionalesRepository data;
	
	@Override
	public List<ProfesionalesEntity> mostrarProfesional() {
		// TODO Auto-generated method stub
		return (List<ProfesionalesEntity>) data.findAll();
	}

	@Override
	public int crearProfesionales(ProfesionalesEntity Profesionales) {
		int respuesta = 0; 
		ProfesionalesEntity pro = data.save(Profesionales);
		
		if(!pro.equals(null)) {
			respuesta = 1;
		}

		return respuesta;
	}

	@Override
	public ProfesionalesEntity buscarProfesionales(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarProfesionales(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}
	
	@Override
	public Optional<ProfesionalesEntity> listarId(int id) {
		// TODO Auto-generated method stub
			
		return data.findById(id);
		
	}

	@Override
	public ProfesionalesEntity agregarProfesionales(ProfesionalesEntity Profesionales) {
		ProfesionalesEntity pro = data.save(Profesionales);
		return pro;
	}

}
