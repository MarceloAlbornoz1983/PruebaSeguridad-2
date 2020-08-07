package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.ActividadMejoraRepository;
import com.proyecto.core.interfaces.IActividadMejoraServices;
import com.proyecto.core.model.ActividadMejoraEntity;

@Service
public class ActividadMejoraService implements IActividadMejoraServices {
	
	@Autowired
	private ActividadMejoraRepository data;

	@Override
	public List<ActividadMejoraEntity> mostrarActivadadMejora() {
		// TODO Auto-generated method stub
		return (List<ActividadMejoraEntity>) data.findAll();
	}

	@Override
	public void crearActividadMejora(ActividadMejoraEntity ActividadMejora) {
		// TODO Auto-generated method stub
		
		data.save(ActividadMejora);

	}

	@Override
	public ActividadMejoraEntity buscarActividadMejora(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarActividadMejora(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}
	
	@Override
	public Optional<ActividadMejoraEntity> listarId(int id) {
		// TODO Auto-generated method stub
			
		return data.findById(id);
	}

}
