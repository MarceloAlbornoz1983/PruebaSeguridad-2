package com.proyecto.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ControladorVistasCliente {

	@GetMapping("reporte_accidente")
	public String reportar_accidente() {
		return "reportar_accidente";
	}
	
	@GetMapping("asesoria_especial")
	public String asesoria_especial() {
		return "asesoria_especial";
	}
	

	
	
	
}
