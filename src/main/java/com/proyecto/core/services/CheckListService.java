package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.CheckListRepository;
import com.proyecto.core.interfaces.ICheckListServices;
import com.proyecto.core.model.CheckListEntity;

@Service
public class CheckListService implements ICheckListServices {

	@Autowired
	private CheckListRepository data;
	@Override
	public List<CheckListEntity> mostrarCheckList() {
		// TODO Auto-generated method stub
		return (List<CheckListEntity>) data.findAll();
	}

	@Override
	public void crearCheckList(CheckListEntity CheckList) {
		// TODO Auto-generated method stub
		data.save(CheckList);
	}

	@Override
	public CheckListEntity buscarCheckList(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarCheckList(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

	@Override
	public Optional<CheckListEntity> listarId(int id) {
		// TODO Auto-generated method stub
			
		return data.findById(id);
	}
}
