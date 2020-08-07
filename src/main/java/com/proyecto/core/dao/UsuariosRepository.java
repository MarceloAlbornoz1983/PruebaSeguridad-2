package com.proyecto.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.UsuariosEntity;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosEntity, Integer> {
	
	UsuariosEntity findByusuario(String usuario);

}
