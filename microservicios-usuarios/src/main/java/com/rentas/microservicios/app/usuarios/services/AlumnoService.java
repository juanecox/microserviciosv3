package com.rentas.microservicios.app.usuarios.services;

import java.util.List;

import com.rentas.microservicios.commons.alumnos.models.entity.Alumno;
import com.rentas.microservicios.commons.services.CommonService;

public interface AlumnoService extends CommonService<Alumno>{
	
	public List<Alumno> findByNombreOrApellido(String term);
	
	public Iterable<Alumno> findAllById(Iterable<Long> ids);
	
	public void eliminarCursoAlumnoPorId(Long id);
}
