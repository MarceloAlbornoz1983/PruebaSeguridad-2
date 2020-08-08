package com.proyecto.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.proyecto.core.interfaces.IAdministradorServices;
import com.proyecto.core.interfaces.ICapacitacionServices;
import com.proyecto.core.interfaces.IEmpresaServices;
import com.proyecto.core.interfaces.IPagoEmpresaServices;
import com.proyecto.core.interfaces.IProfesionalesServices;
import com.proyecto.core.model.AdministradorEntity;
import com.proyecto.core.model.CapacitacionEntity;
import com.proyecto.core.model.EmpresaEntity;
import com.proyecto.core.model.PagoEmpresaEntity;
import com.proyecto.core.model.ProfesionalesEntity;

@Controller
@RequestMapping("/administrador")
public class ControladorVistasAdministrador {

	@Autowired
	private ICapacitacionServices serviceCap;
	@Autowired
	private IEmpresaServices serviceEmp;
	@Autowired
	private IAdministradorServices serviceAdmin;
	@Autowired
	private IProfesionalesServices servicePro;
	@Autowired
	private IPagoEmpresaServices servicePagoEmpresa;
	

	
	//Control pagos Paula 5-8
	@GetMapping("/controlpagos")
	public String controlPago(Model m) {
		
		List<PagoEmpresaEntity> listado = servicePagoEmpresa.mostrarPagoEmpresa();
		m.addAttribute("listado", listado);
		return "control_pagos";
		
	}
	
	@GetMapping("/nuevopago")
	public String nuevoPago(Model m) {
		m.addAttribute("pago", new PagoEmpresaEntity());
		return "ingresar_pago";
		
	}
	

	@GetMapping("accidentabilidad")
	public String calcularAccidentabilidad() {
		return "calcular_accidentabilidad";
	}

	@GetMapping("actividades")
	public String visualizarActividades() {
		return "visualizar_actividades";
	}

	@GetMapping("atrasos")
	public String notificarAtrasos() {
		return "notificar_atrasos";
	}

	@GetMapping("reportecliente")
	public String generarReporteCliente() {
		return "generar_reporte_cliente";
	}

	@GetMapping("reporteglobal")
	public String generarReporteGlobal() {
		return "generar_reporte_global";
	}

	//Clientes - Empresas
	@GetMapping("mantencioninfocliente")
	public String mantencionInfoClientes(Model m) {
		m.addAttribute("empresa", new EmpresaEntity());
		List<AdministradorEntity> listado = serviceAdmin.mostrarAdministrador();
		m.addAttribute("listado", listado);
		return "mantencion_info_clientes";
	}

	@PostMapping("/nuevaempresa")
	public String creaEmpresa(@Valid EmpresaEntity empresa, Model m) {

		serviceEmp.crearEmpresa(empresa);
		return "redirect:/administrador/listarempresas";
	}
	
	@GetMapping("editaremp/{id}")
	public String editarEmpresa(@PathVariable int id, Model m) {
		Optional<EmpresaEntity> empresa = serviceEmp.listarId(id);
		m.addAttribute("empresa", empresa);
		List<AdministradorEntity> listado = serviceAdmin.mostrarAdministrador();
		m.addAttribute("listado", listado);
		return "mantencion_info_clientes";
	}

	@GetMapping("/eliminaremp/{id}")
	public String eliminarEmpresa(@PathVariable int id, Model m) {
		serviceEmp.borrarEmpresa(id);
		return "redirect:/administrador/listarempresas";
	}

	@GetMapping("/listarempresas")
	public String listarEmpresas(Model m) {
		List<EmpresaEntity> listado = serviceEmp.mostrarEmpresa();
		m.addAttribute("listado", listado);
		return "listar_empresas";
	}	
	//Fin Clientes - Empresas
	
	//Profesionales
	@GetMapping("mantencioninfoprofesional")
	public String mantencionInfoProfesional(Model m) {
		m.addAttribute("profesional", new ProfesionalesEntity());
		List<AdministradorEntity> listado = serviceAdmin.mostrarAdministrador();
		m.addAttribute("listado", listado);
		return "mantencion_info_profesional";
	}
	

	@PostMapping("/guardarprofesional")
	public String creaProfesional(@Valid ProfesionalesEntity profesional, Model m) {
		servicePro.crearProfesionales(profesional);
		return "redirect:/administrador/listarprofesional";
	}
	
	@GetMapping("editarprofesional/{id}")
	public String editarProfesional(@PathVariable int id, Model m) {
		Optional<ProfesionalesEntity> profesional = servicePro.listarId(id);
		m.addAttribute("profesional", profesional);
		List<AdministradorEntity> listado = serviceAdmin.mostrarAdministrador();
		m.addAttribute("listado", listado);
		return "mantencion_info_profesional";
	}

	@GetMapping("/eliminarprofesional/{id}")
	public String eliminarProfesional(@PathVariable int id, Model m) {
		servicePro.borrarProfesionales(id);
		return "redirect:/administrador/listarprofesional";
	}
	
	@GetMapping("/listarprofesional")
	public String listarProfesionales(Model m) {
		List<ProfesionalesEntity> listado = servicePro.mostrarProfesional();
		m.addAttribute("listado", listado);
		return "listado_profesionales";
	}	
	//Fin Profesionales
	
	//Capacitaciones	
	@GetMapping("nuevacapacitacion")
	public String nuevaCapacitacion(Model m) {
		m.addAttribute("capacitacion", new CapacitacionEntity());
		return "nueva_capacitacion";
	}

	@PostMapping("/guardarcapacitacion")
	public String creaCapacitacion(@Valid CapacitacionEntity capacitacion, Model m) {
		serviceCap.crearCapacitacion(capacitacion);
		return "redirect:/administrador/listarcapacitaciones";
	}
	
	@GetMapping("/editarcap/{id}")
	public String editarCapacitacion(@PathVariable int id, Model m) {
		Optional<CapacitacionEntity> capacitacion = serviceCap.listarId(id);
		m.addAttribute("capacitacion", capacitacion);
		return "nueva_capacitacion"; 
	}
	
	@GetMapping("/eliminarcap/{id}")
	public String eliminarCapacitacion(@PathVariable int id, Model m) {
		serviceCap.borrarCapacitacion(id);
		return "redirect:/administrador/listarcapacitaciones";
	}
	
	@GetMapping("/listarcapacitaciones")
	public String listarCapacitaciones(Model m) {
		List<CapacitacionEntity> listado = serviceCap.mostrarCapacitacion();
		m.addAttribute("listado", listado);
		return "lista_capacitaciones";
	}	
	//Fin Capacitaciones
	
	//Administradores
	@GetMapping("nuevoadministrador")
	public String nuevoAdministrador(Model m) {
		m.addAttribute("administrador", new AdministradorEntity());
		return "ingreso_administrador";
	}

	@PostMapping("/guardaradministrador")
	public String creaAdministrador(@Valid AdministradorEntity admin, Model m) {
		serviceAdmin.crearAdministrador(admin);
		return "redirect:/administrador/listaradministradores";
	}
	
	@GetMapping("/editaradmin/{id}")
	public String editarAdministrador(@PathVariable int id, Model m) {
		Optional<AdministradorEntity> administrador = serviceAdmin.listarId(id);
		m.addAttribute("administrador", administrador);
		return "ingreso_administrador";
	}

	@GetMapping("/eliminaradmin/{id}")
	public String eliminarAdministrador(@PathVariable int id, Model m) {
		serviceAdmin.borrarAdministrador(id);
		return "redirect:/administrador/listaradministradores";
	}

	@GetMapping("/listaradministradores")
	public String listarAdmin(Model model) {  

		List<AdministradorEntity> listado = serviceAdmin.mostrarAdministrador();
		model.addAttribute("listado", listado);
		return "listado_administradores";
	}
	//Fin Administradores
}
