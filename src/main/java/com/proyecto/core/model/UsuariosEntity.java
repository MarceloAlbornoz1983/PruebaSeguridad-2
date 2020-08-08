package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "USUARIOS")
public class UsuariosEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "ID_USUARIO")
	private int idUsuario;
	@Column (name = "USUARIO")
	private String usuario;
	@Column (name = "CLAVE")
	private String clave;
	
	public UsuariosEntity() {

	}

	public UsuariosEntity(int idUsuario, String usuario, String clave) {
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.clave = clave;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Usuarios [idUsuario=" + idUsuario + ", usuario=" + usuario + ", clave=" + clave + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idUsuario;
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
		UsuariosEntity other = (UsuariosEntity) obj;
		if (idUsuario != other.idUsuario)
			return false;
		return true;
	}
	
	

}
