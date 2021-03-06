package com.proyecto.core.interfaces;

import java.util.List;
import java.util.Optional;

import com.proyecto.core.model.ReporteClienteEntity;

public interface IReporteClienteServices {
	
	public List<ReporteClienteEntity> mostrarReporteCliente();
	
	public void crearReporteCliente(ReporteClienteEntity ReporteCliente);
	
	public ReporteClienteEntity buscarReporteCliente(int id);
	
	public void borrarReporteCliente(int id);

	public Optional<ReporteClienteEntity>listarId(int id);
}
