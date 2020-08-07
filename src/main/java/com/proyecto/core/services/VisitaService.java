package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.VisitaRepository;
import com.proyecto.core.interfaces.IVisitaServices;
import com.proyecto.core.model.VisitaEntity;

@Service
public class VisitaService implements IVisitaServices {

	@Autowired
	public VisitaRepository data;
	
	@Override
	public List<VisitaEntity> mostrarVisita() {
		// TODO Auto-generated method stub
		return (List<VisitaEntity>) data.findAll();
	}

	@Override
	public void crearVisita(VisitaEntity Visita) {
		// TODO Auto-generated method stub
		data.save(Visita);
	}

	@Override
	public VisitaEntity buscarVisita(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarVisita(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}
	
	@Override
	public Optional<VisitaEntity> listarId(int id) {
		// TODO Auto-generated method stub
			
		return data.findById(id);
	}

}
