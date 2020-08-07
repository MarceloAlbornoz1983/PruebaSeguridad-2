package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.ReporteClienteRepository;
import com.proyecto.core.interfaces.IReporteClienteServices;
import com.proyecto.core.model.ReporteClienteEntity;

@Service
public class ReporteCliente implements IReporteClienteServices {
	
	@Autowired
	public ReporteClienteRepository data;

	@Override
	public List<ReporteClienteEntity> mostrarReporteCliente() {
		// TODO Auto-generated method stub
		return (List<ReporteClienteEntity>) data.findAll();
	}

	@Override
	public void crearReporteCliente(ReporteClienteEntity ReporteCliente) {
		// TODO Auto-generated method stub
		data.save(ReporteCliente);
	}

	@Override
	public ReporteClienteEntity buscarReporteCliente(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarReporteCliente(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}
	
	@Override
	public Optional<ReporteClienteEntity> listarId(int id) {
		// TODO Auto-generated method stub
			
		return data.findById(id);
	}

}
