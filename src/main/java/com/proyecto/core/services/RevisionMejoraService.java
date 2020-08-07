package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.RevisionMejoraRepository;
import com.proyecto.core.interfaces.IRevisionMejoraServices;
import com.proyecto.core.model.RevisionMejoraEntity;

@Service
public class RevisionMejoraService implements IRevisionMejoraServices {

	@Autowired
	public RevisionMejoraRepository data;
	
	@Override
	public List<RevisionMejoraEntity> mostrarRevision() {
		// TODO Auto-generated method stub
		return (List<RevisionMejoraEntity>) data.findAll();
	}

	@Override
	public void crearRevisionMejora(RevisionMejoraEntity RevisionMejora) {
		// TODO Auto-generated method stub
		data.save(RevisionMejora);
	}

	@Override
	public RevisionMejoraEntity buscarRevisionMejora(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarRevisionMejora(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}
	
	@Override
	public Optional<RevisionMejoraEntity> listarId(int id) {
		// TODO Auto-generated method stub
			
		return data.findById(id);
	}
}
