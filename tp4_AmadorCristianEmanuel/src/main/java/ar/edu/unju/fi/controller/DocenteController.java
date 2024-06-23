package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.fi.collections.ListadoDocentes;
import ar.edu.unju.fi.model.Docente;

@Controller
public class DocenteController {

	// evita la creacion susesiva de Objetos
	// injeccion de dependencias - @Component en la clase Carrera necesaria de
	// agregar
	@Autowired
	Docente nuevoDocente = new Docente();

	@GetMapping({ "/formDocente" }) // end_point
	public ModelAndView getFormDocente() {
		/*
		 * very important how run getFormCarrera
		 * 
		 * vista formCarrera.html ModelAndView is an container
		 */
		// ModelAndView is an object
		ModelAndView modelView = new ModelAndView("formDocente");
		// add el object
		// modelView.addObject("nuevaCarrera", new Carrera());
		modelView.addObject("nuevoDocente", nuevoDocente);
		// nuevaCarrera
		// new Carrera()
		return modelView;
	}

	@PostMapping("/guardarDocente") // end point
	public ModelAndView saveDocente(@ModelAttribute("nuevoDocente") Docente docenteParaGuardar) {

		// saving
		ListadoDocentes.agregarDocente(docenteParaGuardar);

		// show view
		ModelAndView modelView = new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocentes", ListadoDocentes.listarDocentes());
		return modelView;
	}
	
	@GetMapping("/listaDeDocentes")
	public ModelAndView listarDocentes() {
		ModelAndView modelView = new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocentes", ListadoDocentes.listarDocentes());
		return modelView;
	}
	
	@GetMapping("/eliminarDocente/{legajo}") // end_point
	// borrado fisico
	// NO se deberia borrar el registro, solo cambiar su estado
	public ModelAndView borrarCarreraDelListado(@PathVariable(name = "legajo") String legajo) {
		// borrar
		ListadoDocentes.eliminarDocente(legajo);

		// mostrar nuevo listado
		ModelAndView modelView = new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocentes", ListadoDocentes.listarDocentes());
		return modelView;
	}

	@GetMapping("/modificarDocente/{legajo}")
	public ModelAndView editarDocente(@PathVariable(name = "legajo") String legajo) {
		Docente docente = ListadoDocentes.buscarDocentePorLegajo(legajo);
		
		ModelAndView modelView = new ModelAndView("formDocente");
		modelView.addObject("nuevoDocente", docente);
		modelView.addObject("band",true);			
		return modelView;
	}
	
	@PostMapping("/modificarDocente")
	public ModelAndView updateDocente(@ModelAttribute("nuevoDocente") Docente d) {
		
		ListadoDocentes.modificarDocente(d);
		
		ModelAndView modelView = new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocentes",ListadoDocentes.listarDocentes());
		
		return modelView;
	}
}
