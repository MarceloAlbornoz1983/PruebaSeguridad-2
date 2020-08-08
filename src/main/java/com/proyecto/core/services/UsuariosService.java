package com.proyecto.core.services;
//Codigo que sera implementado despues de la prueba para incorporar la seguirdad con tablas, queda como meta personal. - nICE 
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.UsuariosRepository;
import com.proyecto.core.model.UsuariosEntity;

@Service
public class UsuariosService implements UserDetailsService {

	@Autowired
	private UsuariosRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UsuariosEntity us = repo.findByusuario(username);
		
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		
		UserDetails userDet = new User(us.getUsuario(), us.getClave(), roles);
		
		return userDet;
	}

}
