package com.proyecto.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.core.dao.CapacitacionesRepository;
import com.proyecto.core.interfaces.ICapacitacionesServices;
import com.proyecto.core.model.CapacitacionesEntity;

public class CapacitacionesService implements ICapacitacionesServices {

	@Autowired
	public CapacitacionesRepository data;
	
	@Override
	public List<CapacitacionesEntity> mostrarCapacitaciones() {
		// TODO Auto-generated method stub
		return (List<CapacitacionesEntity>) data.findAll();
	}

	@Override
	public void crearCapacitaciones(CapacitacionesEntity Capacitaciones) {
		// TODO Auto-generated method stub
		data.save(Capacitaciones);
	}

	@Override
	public CapacitacionesEntity buscarCapacitaciones(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarCapacitaciones(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

}
