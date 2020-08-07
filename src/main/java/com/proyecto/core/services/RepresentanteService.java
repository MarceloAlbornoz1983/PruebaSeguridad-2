package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.RepresentanteRepository;
import com.proyecto.core.interfaces.IRepresentanteServices;
import com.proyecto.core.model.RepresentanteEntity;

@Service
public class RepresentanteService implements IRepresentanteServices {

	@Autowired
	public RepresentanteRepository data;
	
	@Override
	public List<RepresentanteEntity> mostrarRepresentante() {
		// TODO Auto-generated method stub
		return (List<RepresentanteEntity>) data.findAll();
	}

	@Override
	public void crearRepresentante(RepresentanteEntity Representante) {
		// TODO Auto-generated method stub
		data.save(Representante);
	}

	@Override
	public RepresentanteEntity buscarRepresentante(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarRepresentante(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}
	
	@Override
	public Optional<RepresentanteEntity> listarId(int id) {
		// TODO Auto-generated method stub
			
		return data.findById(id);
	}
}
