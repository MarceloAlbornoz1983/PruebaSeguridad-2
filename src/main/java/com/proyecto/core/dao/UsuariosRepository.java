package com.proyecto.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.UsuariosEntity;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosEntity, Integer> {
	//Codigo que sera implementado despues de la prueba para incorporar la seguirdad con tablas, queda como meta personal. - nICE 
	UsuariosEntity findByusuario(String usuario);

}
