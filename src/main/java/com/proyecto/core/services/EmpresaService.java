package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.EmpresaRepository;
import com.proyecto.core.interfaces.IEmpresaServices;
import com.proyecto.core.model.EmpresaEntity;

@Service
public class EmpresaService implements IEmpresaServices {

	@Autowired
	public EmpresaRepository data;
	
	@Override
	public List<EmpresaEntity> mostrarEmpresa() {
		// TODO Auto-generated method stub
		return (List<EmpresaEntity>) data.findAll();
	}

	@Override
	public int crearEmpresa(EmpresaEntity Empresa) {
		int respuesta = 0; 
		EmpresaEntity emp = data.save(Empresa);
		
		if(!emp.equals(null)) {
			respuesta = 1;
		}

		return respuesta;
	}

	@Override
	public EmpresaEntity buscarEmpresa(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarEmpresa(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}
	
	@Override
	public Optional<EmpresaEntity> listarId(int id) {
		// TODO Auto-generated method stub
			
		return data.findById(id);
	}

}
