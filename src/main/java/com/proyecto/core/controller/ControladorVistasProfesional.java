package com.proyecto.core.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.core.interfaces.IActividadMejoraServices;
import com.proyecto.core.interfaces.IAsesoriaEspecialServices;
import com.proyecto.core.interfaces.IAsesoriaServices;
import com.proyecto.core.interfaces.ICapacitacionServices;
import com.proyecto.core.interfaces.ICapacitacionesServices;
import com.proyecto.core.interfaces.IEmpresaServices;
import com.proyecto.core.interfaces.IProfesionalesServices;
import com.proyecto.core.interfaces.IVisitaServices;
import com.proyecto.core.model.ActividadMejoraEntity;
import com.proyecto.core.model.AsesoriaEntity;
import com.proyecto.core.model.AsesoriaEspecialEntity;
import com.proyecto.core.model.CapacitacionEntity;
import com.proyecto.core.model.CapacitacionesEntity;
import com.proyecto.core.model.EmpresaEntity;
import com.proyecto.core.model.ProfesionalesEntity;
import com.proyecto.core.model.VisitaEntity;

@Controller
@RequestMapping("/profesional")
public class ControladorVistasProfesional {

	//Variable para Listar Capacitaciones
	@Autowired
	private ICapacitacionesServices serviceCap;
	@Autowired
	private IProfesionalesServices servicePro;
	@Autowired
	private IEmpresaServices servicEemp;
	@Autowired
	private IActividadMejoraServices serviceActMej;
	@Autowired
	private ICapacitacionServices serviceCapList;
	@Autowired
	private IVisitaServices serviceVis;
	@Autowired 
	IAsesoriaServices serviceAse;
	@Autowired
	IAsesoriaEspecialServices serviceAsEsp;
	
	//Capacitaciones
	@GetMapping("capacitacion")
	public String nuevaCapacitacion(Model m) {
		m.addAttribute("capacitaciones", new CapacitacionesEntity());
		List<CapacitacionEntity> listadocap = serviceCapList.mostrarCapacitacion();
		m.addAttribute("listadocap", listadocap);
		List<ProfesionalesEntity> listadopro = servicePro.mostrarProfesional();
		m.addAttribute("listadopro", listadopro);
		List<EmpresaEntity> listadoemp = servicEemp.mostrarEmpresa();
		m.addAttribute("listadoemp", listadoemp);
		return "crear_capacitacion";
	}
	
	@PostMapping("/guardarcapacitaciones")
	public String creaCapacitacion(@Valid CapacitacionesEntity capacitaciones, Model m) {
		serviceCap.crearCapacitaciones(capacitaciones);
		return "redirect:/profesional/lista_capacitacion";
	}
	
	@GetMapping("editarcapacitacion/{id}")
	public String editarCapacitacion(@PathVariable int id, Model m) {
		Optional<CapacitacionesEntity> capacitaciones = serviceCap.listarId(id); 
		m.addAttribute("capacitaciones", capacitaciones);
		List<CapacitacionEntity> listadocap = serviceCapList.mostrarCapacitacion();
		m.addAttribute("listadocap", listadocap);
		List<ProfesionalesEntity> listadopro = servicePro.mostrarProfesional();
		m.addAttribute("listadopro", listadopro);
		List<EmpresaEntity> listadoemp = servicEemp.mostrarEmpresa();
		m.addAttribute("listadoemp", listadoemp);
		return "crear_capacitacion";
	}
	
	@GetMapping("/eliminarcapacitacion/{id}")
	public String eliminarCapacitacion(@PathVariable int id, Model m) {
		serviceCap.borrarCapacitaciones(id);
		return "redirect:/profesional/lista_capacitacion";
	}
	
	@GetMapping("/lista_capacitacion")
	public String listarCapacitacion(Model m) {
		
		List<CapacitacionesEntity>listado=serviceCap.mostrarCapacitaciones();
		m.addAttribute("listado", listado);
		return "lista_capacitacion";
	}
	//Fin Capacitaciones
	
	//Visitas
	@GetMapping("nuevavisita")
	public String nuevaVisita(Model m) {
		m.addAttribute("visitas", new VisitaEntity());
		List<ProfesionalesEntity> listadopro = servicePro.mostrarProfesional();
		m.addAttribute("listadopro", listadopro);
		List<EmpresaEntity> listadoemp = servicEemp.mostrarEmpresa();
		m.addAttribute("listadoemp", listadoemp);
		return "planificar_visita";
	}
	
	@PostMapping("/guardarvisita")
	public String creaVisita(@Valid VisitaEntity visitas, Model m) {
		serviceVis.crearVisita(visitas);
		return "redirect:/profesional/listavisita";
	}
	
	@GetMapping("editarvisita/{id}")
	public String editar(@PathVariable int id, Model m) {
		Optional<VisitaEntity> visitas = serviceVis.listarId(id); 
		m.addAttribute("visitas", visitas);
		List<ProfesionalesEntity> listadopro = servicePro.mostrarProfesional();
		m.addAttribute("listadopro", listadopro);
		List<EmpresaEntity> listadoemp = servicEemp.mostrarEmpresa();
		m.addAttribute("listadoemp", listadoemp);
		return "planificar_visita";
	}
	
	@GetMapping("/eliminarvisita/{id}")
	public String eliminarVisita(@PathVariable int id, Model m) {
		serviceVis.borrarVisita(id);
		return "redirect:/profesional/lista_visita";
	}
	
	@GetMapping("/listavisita")
	public String listarVisita(Model m) {
		List<VisitaEntity>listado=serviceVis.mostrarVisita();
		m.addAttribute("listado", listado);
		return "lista_visita";
	}
	//Fin Visitas
	
	@GetMapping("revisar_cliente")
	public String revisar_cliente() {
		return "revisar_cliente";
	}
	
	@GetMapping("asesoria")
	public String crear_caso_asesoria() {
		return "crear_caso_asesoria";
	}
	
	//Actividad de Mejora
	@GetMapping("mejora")
	public String nuevaActividadMejora(Model m) {
		m.addAttribute("actividadmejora", new ActividadMejoraEntity());
		List<ProfesionalesEntity> listadopro = servicePro.mostrarProfesional();
		m.addAttribute("listadopro", listadopro);
		List<EmpresaEntity> listadoemp = servicEemp.mostrarEmpresa();
		m.addAttribute("listadoemp", listadoemp);
		return "ingreso_actividad_mejora";
	}
	
	@PostMapping("nuevaactividad")
	public String creaActividadMejora(@Valid ActividadMejoraEntity mejora, Model m) {
		serviceActMej.crearActividadMejora(mejora);
		return "redirect:/profesional/listaractividadmejora";
	}
	
	@GetMapping("editarmejora/{id}")
	public String editarActividadMejora(@PathVariable int id, Model m) {
		Optional<ActividadMejoraEntity> actividadmejora = serviceActMej.listarId(id); 
		m.addAttribute("actividadmejora", actividadmejora);
		List<CapacitacionEntity> listadocap = serviceCapList.mostrarCapacitacion();
		m.addAttribute("listadocap", listadocap);
		List<ProfesionalesEntity> listadopro = servicePro.mostrarProfesional();
		m.addAttribute("listadopro", listadopro);
		List<EmpresaEntity> listadoemp = servicEemp.mostrarEmpresa();
		m.addAttribute("listadoemp", listadoemp);
		return "ingreso_actividad_mejora";
	}

	@GetMapping("/eliminarmejora/{id}")
	public String eliminarActividadMejora(@PathVariable int id, Model m) {
		serviceActMej.borrarActividadMejora(id);
		return "redirect:/profesional/listaractividadmejora";
	}
	
	@GetMapping("listaractividadmejora")
	public String listaActividadMejora(Model m) {
		List<ActividadMejoraEntity> listado = serviceActMej.mostrarActivadadMejora();
		m.addAttribute("listado", listado);
		return "listado_actividad_mejora";
	}
	//Fin actividad de mejora
	
	//Asesorias
	@GetMapping("ingresoasesoria")
	public String ingresoAsesoria(Model m) {
		m.addAttribute("asesoria", new AsesoriaEntity());
		List<ProfesionalesEntity> listadopro = servicePro.mostrarProfesional();
		m.addAttribute("listadopro", listadopro);
		List<EmpresaEntity> listadoemp = servicEemp.mostrarEmpresa();
		m.addAttribute("listadoemp", listadoemp);
		return "ingreso_asesoria";
	}
	
	@PostMapping("guardarasesoria")
	public String creaAsesoria(@Valid AsesoriaEntity asesorias, Model m) {
		serviceAse.crearAsesoria(asesorias);
		return "redirect:/profesional/listaasesoria";
	}

	@GetMapping("editarasesoria/{id}")
	public String editarAsesoria(@PathVariable int id, Model m) {
		Optional<AsesoriaEntity> asesoria = serviceAse.listarId(id); 
		m.addAttribute("asesoria", asesoria);
		List<ProfesionalesEntity> listadopro = servicePro.mostrarProfesional();
		m.addAttribute("listadopro", listadopro);
		List<EmpresaEntity> listadoemp = servicEemp.mostrarEmpresa();
		m.addAttribute("listadoemp", listadoemp);
		return "ingreso_asesoria";
	}

	@GetMapping("/eliminarasesoria/{id}")
	public String eliminarAsesoria(@PathVariable int id, Model m) {
		serviceAse.borrarAsesoria(id);
		return "redirect:/profesional/listaasesoria";
	}

	@GetMapping("/listaasesoria")
	public String listarAsesoria(Model m) {
		
		List<AsesoriaEntity>listado=serviceAse.mostrarAsesoria();
		m.addAttribute("listado", listado);
		return "lista_asesoria";
	}
	
	//Fin Asesorias
	
	//Asesorias Especiales
		@GetMapping("ingresoasesoriaespecial")
		public String ingresoAsesoriaEspecial(Model m) {
			m.addAttribute("asesoriaespecial", new AsesoriaEspecialEntity());
			List<EmpresaEntity> listadoemp = servicEemp.mostrarEmpresa();
			m.addAttribute("listadoemp", listadoemp);
			return "asesoria_especial";
		}
		
		@PostMapping("guardarasesoriaespecial")
		public String creaAsesoriaEspecial(@Valid AsesoriaEspecialEntity asesoriasaespeciales, Model m) {
			serviceAsEsp.crearAsesoriaEspecial(asesoriasaespeciales);
			return "redirect:/profesional/listaasesoriaespecial";
		}

		@GetMapping("editarasesoriaespecial/{id}")
		public String editarAsesoriaEspecial(@PathVariable int id, Model m) {
			Optional<AsesoriaEspecialEntity> asesoriaespecial = serviceAsEsp.listarId(id); 
			m.addAttribute("asesoriaespecial", asesoriaespecial);
			List<ProfesionalesEntity> listadopro = servicePro.mostrarProfesional();
			m.addAttribute("listadopro", listadopro);
			List<EmpresaEntity> listadoemp = servicEemp.mostrarEmpresa();
			m.addAttribute("listadoemp", listadoemp);
			return "asesoria_especial";
		}

		@GetMapping("/eliminarasesoriaespecial/{id}")
		public String eliminarAsesoriaEspecial(@PathVariable int id, Model m) {
			serviceAsEsp.borrarAsesoriaEspecial(id);
			return "redirect:/profesional/listaasesoriaespecial";
		}

		@GetMapping("/listaasesoriaespecial")
		public String listarAsesoriaEspecial(Model m) {
			
			List<AsesoriaEspecialEntity>listado=serviceAsEsp.mostrarAsesoriaEspecial();
			m.addAttribute("listado", listado);
			return "lista_asesoria_especial";
		}
		
		//Fin Asesorias Especiales
	
	@GetMapping("crear_check")
	public String crear_check_list() {
		return "crear_check_list";
	}
	
	@GetMapping("responder_check")
	public String responder_check_list() {
		return "responder_check_list";
	}
	
}
