package com.solucionexpress.microservicios.app.examenes.models.repository;

import com.solucionexpress.microservicios.commons.examenes.models.entity.Examen;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ExamenRepository extends CrudRepository<Examen,Long> {
	@Query("select e from Examen e where e.nombre like %?1%")
	public List<Examen> findByNombre(String term);
}
