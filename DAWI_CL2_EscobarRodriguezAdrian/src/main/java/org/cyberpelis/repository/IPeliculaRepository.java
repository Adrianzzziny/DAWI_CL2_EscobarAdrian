package org.cyberpelis.repository;

import org.cyberpelis.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Integer>{

}
