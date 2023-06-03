package com.rentas.microservicios.app.cursos.services;

import com.rentas.microservicios.app.cursos.models.entity.Curso;
import com.rentas.microservicios.commons.alumnos.models.entity.Alumno;
import com.rentas.microservicios.commons.services.CommonService;

public interface CursoService extends CommonService<Curso> {

	public Curso findCursoByAlumnoId(Long id);
	
	public Iterable<Long> obtenerExamenesIdsConRespuestasAlumno(Long alumnoId);
	
	public Iterable<Alumno> obtenerAlumnosPorCurso(Iterable<Long> ids);
	
	public void eliminarCursoAlumnoPorId(Long id);
}
