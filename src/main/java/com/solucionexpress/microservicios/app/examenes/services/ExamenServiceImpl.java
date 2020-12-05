package com.solucionexpress.microservicios.app.examenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.solucionexpress.microservicios.commons.examenes.models.entity.Asignatura;
import com.solucionexpress.microservicios.commons.examenes.models.entity.Examen;
import com.solucionexpress.microservicios.app.examenes.models.repository.AsignaturaRepository;
import com.solucionexpress.microservicios.app.examenes.models.repository.ExamenRepository;
import com.solucionexpress.microservicios.commons.services.CommonServiceImpl;
@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen,ExamenRepository> implements ExamenService  {
	
	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Examen> findByNombre(String term) {
		return repository.findByNombre(term);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Asignatura> findAllAsignaturas() {
		return asignaturaRepository.findAll();
	}
}
