package com.solucionexpress.microservicios.app.examenes.models.repository;

import com.solucionexpress.microservicios.commons.examenes.models.entity.Examen;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ExamenRepository extends PagingAndSortingRepository<Examen,Long> {
	@Query("select e from Examen e where e.nombre like %?1%")
	public List<Examen> findByNombre(String term);
	
	@Query("select e.id from Pregunta p join p.examen e where p.id in ?1 group by e.id")
    public Iterable<Long> findExamenesIdsConRespuestasByPreguntaIds(Iterable<Long> preguntaIds);
}
