package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.AdministradorRepository;
import com.proyecto.core.interfaces.IAdministradorServices;
import com.proyecto.core.model.AdministradorEntity;



@Service
public class AdministradorService implements IAdministradorServices{
	
	@Autowired
	private AdministradorRepository data;

	@Override
	public List<AdministradorEntity> mostrarAdministrador() {
		return (List<AdministradorEntity>) data.findAll();
	}

	@Override
	public int crearAdministrador(AdministradorEntity Administrador) {
		int respuesta = 0; 
		AdministradorEntity adm = data.save(Administrador);
		
		if(!adm.equals(null)) {
			respuesta = 1;
		}

		return respuesta;
	}

	@Override
	public AdministradorEntity buscarAdministrador(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarAdministrador(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}
	
	@Override
	public Optional<AdministradorEntity> listarId(int id) {
		return data.findById(id);
	}

	
}
