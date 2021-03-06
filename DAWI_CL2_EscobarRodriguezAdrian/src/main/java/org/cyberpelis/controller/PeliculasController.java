package org.cyberpelis.controller;

import org.cyberpelis.models.Pelicula;
import org.cyberpelis.repository.IClasificacionRepository;
import org.cyberpelis.repository.IGeneroRepository;
import org.cyberpelis.repository.IPeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PeliculasController {

	@Autowired
	private IGeneroRepository repog;
	
	@Autowired
	private IClasificacionRepository repoc;
	
	@Autowired
	private IPeliculaRepository repop;
	
	@GetMapping("/peliculas/cargar")
	public String abrirpag(Model model) {
		model.addAttribute("pelicula",new Pelicula());	
		//Combo Generos
		model.addAttribute("lstGeneros",repog.findAll());
		//Combo Clasificacion
		model.addAttribute("lstClasificacion",repoc.findAll());
		return "crudPeliculas";
	}
	
	@PostMapping("/peliculas/actualizar")
	public String actualizarpag(@ModelAttribute Pelicula pelicula, Model model) {
		System.out.println(pelicula);
		
		repop.save(pelicula);
		model.addAttribute("mensaje","Producto Actualizado");
		
		model.addAttribute("lstGeneros",repog.findAll());
		model.addAttribute("lstClasificacion",repoc.findAll());
		return "crudPeliculas";
	}
	
	@GetMapping("/peliculas/listar")
	public String listadoPeliculas(Model model) {
		
		model.addAttribute("lstPeliculas",repop.findAll());
		return "listado";
	}
	
	
	
	
	
	
}
