package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.AsesoriaEspecialRepository;
import com.proyecto.core.interfaces.IAsesoriaEspecialServices;
import com.proyecto.core.model.AsesoriaEspecialEntity;

@Service
public class AsesoriaEspecialService implements IAsesoriaEspecialServices {
	
	@Autowired
	private AsesoriaEspecialRepository data;

	@Override
	public List<AsesoriaEspecialEntity> mostrarAsesoriaEspecial() {
		// TODO Auto-generated method stub
		return (List<AsesoriaEspecialEntity>) data.findAll();
	}

	@Override
	public void crearAsesoriaEspecial(AsesoriaEspecialEntity AsesoriaEspecial) {
		// TODO Auto-generated method stub
		data.save(AsesoriaEspecial);
	}

	@Override
	public AsesoriaEspecialEntity buscarAsesoriaEspecial(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarAsesoriaEspecial(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

	@Override
	public Optional<AsesoriaEspecialEntity> listarId(int id) {
		// TODO Auto-generated method stub
			
		return data.findById(id);
	}
}
