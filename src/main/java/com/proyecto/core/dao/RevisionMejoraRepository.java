package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.RevisionMejoraEntity;

@Repository
public interface RevisionMejoraRepository extends CrudRepository<RevisionMejoraEntity, Integer>{

}
