package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="CAPACITACION")
public class CapacitacionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name="ID_CAP")
	private int idCap;
	@Column (name="NOMBRE_CAPACITACION")
	private String nomCap;
	@Column (name="FECHA_CREACION_CAPACITACION")
	private String fechaCreacionCap;
	@Column (name="VIGENCIA_CAPACITACION")
	private String vigenciaCap;
	
	
	
	public CapacitacionEntity() {
		
	}

	public CapacitacionEntity(int idCap, String nomCap, String fechaCreacionCap, String vigenciaCap) {
		super();
		this.idCap = idCap;
		this.nomCap = nomCap;
		this.fechaCreacionCap = fechaCreacionCap;
		this.vigenciaCap = vigenciaCap;
	}

	public int getIdCap() {
		return idCap;
	}

	public void setIdCap(int idCap) {
		this.idCap = idCap;
	}

	public String getNomCap() {
		return nomCap;
	}

	public void setNomCap(String nomCap) {
		this.nomCap = nomCap;
	}

	public String getFechaCreacionCap() {
		return fechaCreacionCap;
	}

	public void setFechaCreacionCap(String fechaCreacionCap) {
		this.fechaCreacionCap = fechaCreacionCap;
	}

	public String getVigenciaCap() {
		return vigenciaCap;
	}

	public void setVigenciaCap(String vigenciaCap) {
		this.vigenciaCap = vigenciaCap;
	}

	@Override
	public String toString() {
		return "CapacitacionEntity [idCap=" + idCap + ", nomCap=" + nomCap + ", fechaCreacionCap=" + fechaCreacionCap
				+ ", vigenciaCap=" + vigenciaCap + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCap;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CapacitacionEntity other = (CapacitacionEntity) obj;
		if (idCap != other.idCap)
			return false;
		return true;
	}
	
	
	
	

}
