package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.PagoEmpresaRepository;
import com.proyecto.core.interfaces.IPagoEmpresaServices;
import com.proyecto.core.model.PagoEmpresaEntity;

@Service
public class PagoEmpresaService implements IPagoEmpresaServices {
	
	@Autowired
	private PagoEmpresaRepository data;

	@Override
	public List<PagoEmpresaEntity> mostrarPagoEmpresa() {
		// TODO Auto-generated method stub
		return (List<PagoEmpresaEntity>) data.findAll();
	}

	@Override
	public void crearPagoEmpresa(PagoEmpresaEntity PagoEmpresa) {
		// TODO Auto-generated method stub
		data.save(PagoEmpresa);
	}

	@Override
	public PagoEmpresaEntity buscarPagoEmpresa(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarPagoEmpresa(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

	@Override
	public Optional<PagoEmpresaEntity> listarId(int id) {
		// TODO Auto-generated method stub
			
		return data.findById(id);
	}
}
