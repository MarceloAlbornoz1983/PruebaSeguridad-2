package com.proyecto.core;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.proyecto.core.dao.UsuariosRepository;
import com.proyecto.core.model.UsuariosEntity;

@SpringBootTest
class MiProyectoApplicationTests {

	@Autowired
	private UsuariosRepository repo;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	void contextLoads() {
		
		UsuariosEntity us = new UsuariosEntity();
		us.setUsuario("asdasd");
		us.setClave(encoder.encode("asdasdasdasd"));
		UsuariosEntity retorno = repo.save(us);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
