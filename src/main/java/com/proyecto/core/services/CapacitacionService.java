package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.CapacitacionRepository;
import com.proyecto.core.interfaces.ICapacitacionServices;
import com.proyecto.core.model.CapacitacionEntity;

@Service
public class CapacitacionService implements ICapacitacionServices {

	@Autowired
	public CapacitacionRepository data;
	
	@Override
	public List<CapacitacionEntity> mostrarCapacitacion() {
		// TODO Auto-generated method stub
		return (List<CapacitacionEntity>) data.findAll();
	}

	@Override
	public int crearCapacitacion(CapacitacionEntity Capacitacion) {	
		int respuesta = 0; 
		CapacitacionEntity cp = data.save(Capacitacion);
		
		if(!cp.equals(null)) {
			respuesta = 1;
		}

		return respuesta;
	}

	@Override
	public CapacitacionEntity buscarCapacitacion(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarCapacitacion(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

	@Override
	public Optional<CapacitacionEntity> listarId(int id) {
		// TODO Auto-generated method stub
			
		return data.findById(id);
	}
}
