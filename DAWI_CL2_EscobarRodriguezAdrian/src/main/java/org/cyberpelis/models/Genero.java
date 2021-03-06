package org.cyberpelis.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genero")
public class Genero {
	@Id
	private int idgenero;
	private String nombreGenero;
	
	@Override
	public String toString() {
		return "Genero [idgenero=" + idgenero + ", nombreGenero=" + nombreGenero + "]";
	}

	public Genero() {
		super();
	}

	public Genero(int idgenero, String nombreGenero) {
		super();
		this.idgenero = idgenero;
		this.nombreGenero = nombreGenero;
	}

	public int getIdgenero() {
		return idgenero;
	}

	public void setIdgenero(int idgenero) {
		this.idgenero = idgenero;
	}

	public String getNombreGenero() {
		return nombreGenero;
	}

	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}
	
	
}
