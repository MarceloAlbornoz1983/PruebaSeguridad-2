package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.AdministradorEntity;

@Repository
public interface AdministradorRepository extends CrudRepository<AdministradorEntity, Integer>{

}
