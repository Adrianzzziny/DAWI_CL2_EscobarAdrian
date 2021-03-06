package org.cyberpelis.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula {
	@Id
	@Column(name="idPelicula")
	private int idpelicula;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="fecha")
	private int fecha;
	
	@Column(name="duracion")
	private String duracion;
	
	private int idgenero;
	private int idclasificacion;
	
	@Override
	public String toString() {
		return "Pelicula [idpelicula=" + idpelicula + ", titulo=" + titulo + ", fecha=" + fecha + ", duracion="
				+ duracion + ", idgenero=" + idgenero + ", idclasificacion=" + idclasificacion + "]";
	}

	public Pelicula() {
		super();
	}

	public Pelicula(int idpelicula, String titulo, int fecha, String duracion, int idgenero, int idclasificacion) {
		super();
		this.idpelicula = idpelicula;
		this.titulo = titulo;
		this.fecha = fecha;
		this.duracion = duracion;
		this.idgenero = idgenero;
		this.idclasificacion = idclasificacion;
	}

	public int getIdpelicula() {
		return idpelicula;
	}

	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getIdgenero() {
		return idgenero;
	}

	public void setIdgenero(int idgenero) {
		this.idgenero = idgenero;
	}

	public int getIdclasificacion() {
		return idclasificacion;
	}

	public void setIdclasificacion(int idclasificacion) {
		this.idclasificacion = idclasificacion;
	}
	
	
	
}
