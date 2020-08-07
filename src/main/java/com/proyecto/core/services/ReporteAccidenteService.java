package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.ReporteAccidenteRepository;
import com.proyecto.core.interfaces.IReporteAccidenteServices;
import com.proyecto.core.model.ReporteAccidenteEntity;

@Service
public class ReporteAccidenteService implements IReporteAccidenteServices {

	@Autowired
	public ReporteAccidenteRepository data;
	
	@Override
	public List<ReporteAccidenteEntity> mostrarReporteAccidente() {
		// TODO Auto-generated method stub
		return (List<ReporteAccidenteEntity>) data.findAll();
	}

	@Override
	public void crearReporteAccidente(ReporteAccidenteEntity ReporteAccidente) {
		// TODO Auto-generated method stub
		data.save(ReporteAccidente);
	}

	@Override
	public ReporteAccidenteEntity buscarReporteAccidente(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarReporteAccidente(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}
	
	@Override
	public Optional<ReporteAccidenteEntity> listarId(int id) {
		// TODO Auto-generated method stub
			
		return data.findById(id);
	}
}
