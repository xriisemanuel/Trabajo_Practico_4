package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.ListadoCarreras;
import ar.edu.unju.fi.collections.ListadoDocentes;
import ar.edu.unju.fi.collections.ListadoMaterias;
import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.model.Materia;

@Controller
public class MateriaController {
	// evita la creacion susesiva de Objetos
	// injeccion de dependencias - @Component en la clase Carrera necesaria de agregar
	@Autowired
	Materia nuevaMateria = new Materia();
	
	@GetMapping({ "/formMateria" }) // end_point
	public ModelAndView getFormMateria() {
		/*
		 * very important how run getFormCarrera
		 * 
		 * vista formCarrera.html ModelAndView is an container
		 */
		// ModelAndView is an object
		ModelAndView modelView = new ModelAndView("formMateria");
		// add el object
		//modelView.addObject("nuevaCarrera", new Carrera());
		
		//Patron Singelton
		modelView.addObject("nuevaMateria", nuevaMateria);
		 modelView.addObject("listadoDocentes",ListadoDocentes.listarDocentes());
		// nuevaCarrera
		// new Carrera()
		return modelView;
	}

	@PostMapping("/guardarMateria") // end point
	public ModelAndView saveMateria(@ModelAttribute("nuevaMateria") Materia materiaParaGuardar) {

		// saving
		materiaParaGuardar.setModality(true);
		Docente unDocente = ListadoDocentes.buscarDocentePorLegajo(materiaParaGuardar.getTeacher_name().getLegajo());
		materiaParaGuardar.setTeacher_name(unDocente);
		ListadoMaterias.agregarMateria(materiaParaGuardar);

		// show view
		ModelAndView modelView = new ModelAndView("listaDeMaterias");
		modelView.addObject("listadoMaterias", ListadoMaterias.listarMaterias());
		return modelView;
	}
	
	@GetMapping("/listaDeMaterias")
	public ModelAndView listarMaterias() {
		ModelAndView modelView = new ModelAndView("listaDeMaterias");
		modelView.addObject("listadoMaterias", ListadoMaterias.listarMaterias());
		return modelView;
	}

	@GetMapping("/eliminarMateria/{codigo}") // end_point
	// borrado fisico
	// NO se deberia borrar el registro, solo cambiar su estado
	public ModelAndView borrarMateriaDelListado(@PathVariable(name="codigo") String codigo) {
		// borrar
		ListadoMaterias.eliminarMateria(codigo);

		// mostrar nuevo listado
		ModelAndView modelView = new ModelAndView("listaDeMaterias");
		modelView.addObject("listadoMaterias", ListadoMaterias.listarMaterias());
		
		return modelView;
	}
	  @GetMapping("/modificarMateria/{codigo}") // end_point
	    public ModelAndView editarMateria(@PathVariable(name = "codigo") String codigo) {
	        // Obtener la carrera por código
	        Materia materiaEditar = ListadoMaterias.buscarMateriaPorCodigo(codigo);

	        // Mostrar el formulario de edición con los datos de la carrera
	        ModelAndView modelView = new ModelAndView("formMateria");
	        modelView.addObject("nuevaMateria", materiaEditar);
	        modelView.addObject("listadoDocentes",ListadoDocentes.listarDocentes());
	        modelView.addObject("band",true);
	        return modelView;
	    }
	    @PostMapping("/modificarMateria")
	    public ModelAndView updateMateria(@ModelAttribute("nuevaMateria") Materia m) {
			
			//guardar
			ListadoMaterias.modificarMateria(m);
			
			//mostrar el listado
			ModelAndView modelView = new ModelAndView("listaDeMaterias");
			modelView.addObject("listadoMaterias", ListadoMaterias.listarMaterias());
			
			return modelView;		
		}
}
