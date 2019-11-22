package com.cdainfo.PruebaStart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class Pcontroller {
	@Autowired
	AlumnoRepository AlumnRepo;
	@GetMapping("/alumno/{ID}")
	public List<Alumno> getByidAlumno(@PathVariable Long ID){
		
		return AlumnRepo.getByidAlumno(ID);
		
	}



}
