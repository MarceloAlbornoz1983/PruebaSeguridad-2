package com.proyecto.core.interfaces;

import java.util.List;

import com.proyecto.core.model.PagoEmpresaEntity;

public interface IPagoEmpresaSerices {
	
	public List<PagoEmpresaEntity> mostrarPagoEmpresa();
	
	public void crearPagoEmpresa(PagoEmpresaEntity PagoEmpresa);
	
	public PagoEmpresaEntity buscarPagoEmpresa(int id);
	
	public void borrarPagoEmpresa(int id);

}
