package com.solucionexpress.microservicios.app.examenes.services;

import java.util.List;

import com.solucionexpress.microservicios.commons.examenes.models.entity.Asignatura;
import com.solucionexpress.microservicios.commons.examenes.models.entity.Examen;
import com.solucionexpress.microservicios.commons.services.CommonService;

public interface ExamenService extends CommonService<Examen>{
	public List<Examen> findByNombre(String term);
	
	public Iterable<Asignatura> findAllAsignaturas();
	
}
