package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.fi.collections.ListadoAlumnos;
import ar.edu.unju.fi.collections.ListadoCarreras;
import ar.edu.unju.fi.model.Alumno;
@Controller
public class AlumnoController {
	// evita la creacion susesiva de Objetos
		// injeccion de dependencias - @Component en la clase Carrera necesaria de agregar
		@Autowired
		Alumno nuevoAlumno = new Alumno();
		
		@GetMapping({ "/formAlumno" }) // end_point
		public ModelAndView getFormAlumno() {
			/*
			 * very important how run getFormCarrera
			 * 
			 * vista formCarrera.html ModelAndView is an container
			 */
			// ModelAndView is an object
			ModelAndView modelView = new ModelAndView("formAlumno");
			// add el object
			//modelView.addObject("nuevaCarrera", new Carrera());
			
			//Patron Singelton
			modelView.addObject("nuevoAlumno", nuevoAlumno);
			// nuevaCarrera
			// new Carrera()
			return modelView;
		}

		@PostMapping("/guardarAlumno") // end point
		public ModelAndView saveAlumno(@ModelAttribute("nuevoAlumno") Alumno alumnoParaGuardar) {

			// saving
			ListadoAlumnos.agregarAlumno(alumnoParaGuardar);

			// show view
			ModelAndView modelView = new ModelAndView("listaDeAlumnos");
			modelView.addObject("listadoAlumnos", ListadoAlumnos.listarAlumnos());
			return modelView;
		}
		@GetMapping("/listaDeAlumnos")
		public ModelAndView listarAlumnos() {
			ModelAndView modelView = new ModelAndView("listaDeAlumnos");
			modelView.addObject("listadoAlumnos", ListadoAlumnos.listarAlumnos());
			return modelView;
		}
		
		@GetMapping("/eliminarAlumno/{id}") // end_point
		// borrado fisico
		// NO se deberia borrar el registro, solo cambiar su estado
		public ModelAndView borrarAlumnoDelListado(@PathVariable(name="id") String id) {
			// borrar
			ListadoAlumnos.eliminarAlumno(id);

			// mostrar nuevo listado
			ModelAndView modelView = new ModelAndView("listaDeAlumnos");
			modelView.addObject("listadoAlumnos", ListadoAlumnos.listarAlumnos());
			return modelView;
		}
}
