package org.cyberpelis.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clasificacion")
public class Clasificacion {
	@Id
	private int idclasificacion;
	private String nombreClasificacion;
	private String descripcionClasificacion;
	
	@Override
	public String toString() {
		return "Clasificacion [idclasificacion=" + idclasificacion + ", nombreClasificacion=" + nombreClasificacion
				+ ", descripcionClasificacion=" + descripcionClasificacion + "]";
	}

	public Clasificacion() {
		super();
	}

	public Clasificacion(int idclasificacion, String nombreClasificacion, String descripcionClasificacion) {
		super();
		this.idclasificacion = idclasificacion;
		this.nombreClasificacion = nombreClasificacion;
		this.descripcionClasificacion = descripcionClasificacion;
	}

	public int getIdclasificacion() {
		return idclasificacion;
	}

	public void setIdclasificacion(int idclasificacion) {
		this.idclasificacion = idclasificacion;
	}

	public String getNombreClasificacion() {
		return nombreClasificacion;
	}

	public void setNombreClasificacion(String nombreClasificacion) {
		this.nombreClasificacion = nombreClasificacion;
	}

	public String getDescripcionClasificacion() {
		return descripcionClasificacion;
	}

	public void setDescripcionClasificacion(String descripcionClasificacion) {
		this.descripcionClasificacion = descripcionClasificacion;
	}
	
	
	
}
