package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.AsesoriaRepository;
import com.proyecto.core.interfaces.IAsesoriaServices;
import com.proyecto.core.model.AsesoriaEntity;

@Service
public class AsesoriaService implements IAsesoriaServices {

	@Autowired
	public AsesoriaRepository data;
	
	@Override
	public List<AsesoriaEntity> mostrarAsesoria() {
		// TODO Auto-generated method stub
		return (List<AsesoriaEntity>) data.findAll();
	}

	@Override
	public void crearAsesoria(AsesoriaEntity Asesoria) {
		// TODO Auto-generated method stub
		data.save(Asesoria);
	}

	@Override
	public AsesoriaEntity buscarAsesoria(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarAsesoria(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

	@Override
	public Optional<AsesoriaEntity> listarId(int id) {
		// TODO Auto-generated method stub
			
		return data.findById(id);
	}
}
