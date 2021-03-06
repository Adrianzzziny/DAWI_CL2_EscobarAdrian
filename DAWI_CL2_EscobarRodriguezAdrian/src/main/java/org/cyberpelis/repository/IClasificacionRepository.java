package org.cyberpelis.repository;

import org.cyberpelis.models.Clasificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClasificacionRepository extends JpaRepository<Clasificacion, String>{

}
