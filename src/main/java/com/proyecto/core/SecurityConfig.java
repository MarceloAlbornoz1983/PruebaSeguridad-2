package com.proyecto.core;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.proyecto.core.services.UsuariosService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	// Codigo que sera implementado despues de la prueba para incorporar la seguirdad con tablas, queda como meta personal. - nICE 
	@Autowired
	private UsuariosService userDetailsService;
	
	
	 
	 @Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder()
	{
		
		 
		 BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		
		return bCryptPasswordEncoder;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{ 
		
		//auth.inMemoryAuthentication().withUser("nice").password("12345").roles("USER");
		
		
		// Codigo que sera implementado despues de la prueba para incorporar la seguirdad con tablas, queda como meta personal. - nICE
		auth.userDetailsService(userDetailsService).passwordEncoder(bcrypt);
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http
		.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/api/profesionales/listar/").hasRole("ADMIN")
        .antMatchers(HttpMethod.POST, "/api/profesionales/crear/").hasRole("ADMIN")
        .antMatchers(HttpMethod.PUT, "/api/profesionales/*").hasRole("ADMIN")
        .antMatchers(HttpMethod.PATCH, "/api/profesionales/*").hasRole("ADMIN")
        .antMatchers(HttpMethod.DELETE, "/api/profesionales/eliminar/").hasRole("ADMIN")
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
		
	}
}
