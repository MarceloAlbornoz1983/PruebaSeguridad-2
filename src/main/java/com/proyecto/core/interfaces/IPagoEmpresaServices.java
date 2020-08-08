package com.proyecto.core.interfaces;

import java.util.List;
import java.util.Optional;

import com.proyecto.core.model.PagoEmpresaEntity;

public interface IPagoEmpresaServices {
	
	public List<PagoEmpresaEntity> mostrarPagoEmpresa();
	
	public void crearPagoEmpresa(PagoEmpresaEntity PagoEmpresa);
	
	public PagoEmpresaEntity buscarPagoEmpresa(int id);
	
	public void borrarPagoEmpresa(int id);

	public Optional<PagoEmpresaEntity>listarId(int id);
}
