package com.proyecto.core.RestController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.core.interfaces.IProfesionalesServices;
import com.proyecto.core.model.ProfesionalesEntity;
import com.proyecto.core.services.ProfesionalesService;


@RestController
@RequestMapping("/api/profesionales")
public class ProfesionalRestController {

	@Autowired
	public IProfesionalesServices profesionalService;

	@GetMapping("/listar")
	public List<ProfesionalesEntity> mostrarProfesionales() {

		return profesionalService.mostrarProfesional();
	}

	@GetMapping("/{id}")
	public ProfesionalesEntity buscarId(@PathVariable int id) {
		return profesionalService.buscarProfesionales(id);
	}

	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	ProfesionalesEntity newBook(@Valid @RequestBody ProfesionalesEntity pro) {
		return profesionalService.agregarProfesionales(pro);
	}

	/*
	 * @PostMapping("/crear") public ResponseEntity<ProfesionalesEntity>
	 * crearProfesional(@RequestBody ProfesionalesEntity pro) {
	 * profesionalService.crearProfesionales(pro); return new
	 * ResponseEntity<ProfesionalesEntity>(HttpStatus.CREATED); }
	 */

	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<ProfesionalesEntity> eliminarCliente(@PathVariable int id) {
		ProfesionalesEntity objProfesional = profesionalService.buscarProfesionales(id);
		if (objProfesional != null) {
			profesionalService.borrarProfesionales(id);
		} else {
			return new ResponseEntity<ProfesionalesEntity>(objProfesional, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<ProfesionalesEntity>(objProfesional, HttpStatus.OK);
	}

}
