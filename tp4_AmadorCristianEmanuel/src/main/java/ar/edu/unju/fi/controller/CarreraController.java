package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.ListadoCarreras;
import ar.edu.unju.fi.model.Carrera;

@Controller
public class CarreraController {

	// evita la creacion susesiva de Objetos
	// injeccion de dependencias - @Component en la clase Carrera necesaria de
	// agregar
	@Autowired
	Carrera nuevaCarrera = new Carrera(); //patron singelton

	@GetMapping({ "/formCarrera" }) // end_point
	public ModelAndView getFormCarrera() {
		/*
		 * very important how run getFormCarrera
		 * 
		 * vista formCarrera.html ModelAndView is an container
		 */
		// ModelAndView is an object
		ModelAndView modelView = new ModelAndView("formCarrera");
		// add el object
		// modelView.addObject("nuevaCarrera", new Carrera());

		// Patron Singelton
		modelView.addObject("nuevaCarrera", nuevaCarrera);
		// nuevaCarrera
		// new Carrera()
		return modelView;
	}

	@PostMapping("/guardarCarrera") // end point
	public ModelAndView saveCarrera(@ModelAttribute("nuevaCarrera") Carrera carreraParaGuardar) {

		// saving
		ListadoCarreras.agregarCarrera(carreraParaGuardar);

		// show view
		ModelAndView modelView = new ModelAndView("listaDeCarreras");
		modelView.addObject("listadoCarreras", ListadoCarreras.listarCarreras());
		return modelView;
	}

	@GetMapping("/listaDeCarreras")
	public ModelAndView listarCarreras() {
		ModelAndView modelView = new ModelAndView("listaDeCarreras");
		modelView.addObject("listadoCarreras", ListadoCarreras.listarCarreras());
		return modelView;
	}

	@GetMapping("/eliminarCarrera/{codigo}") // end_point
	// borrado fisico
	// NO se deberia borrar el registro, solo cambiar su estado
	public ModelAndView borrarCarreraDelListado(@PathVariable(name = "codigo") String codigo) {
		// borrar
		ListadoCarreras.eliminarCarrera(codigo);

		// mostrar nuevo listado
		ModelAndView modelView = new ModelAndView("listaDeCarreras");
		modelView.addObject("listadoCarreras", ListadoCarreras.listarCarreras());
		return modelView;
	}
	
    @GetMapping("/modificarCarrera/{codigo}") // end_point
    public ModelAndView editarCarrera(@PathVariable(name = "codigo") String codigo) {
        // Obtener la carrera por código
        Carrera carreraAEditar = ListadoCarreras.buscarCarreraPorCodigo(codigo);

        // Mostrar el formulario de edición con los datos de la carrera
        ModelAndView modelView = new ModelAndView("formCarrera");
        modelView.addObject("nuevaCarrera", carreraAEditar);
        modelView.addObject("band",true);
        return modelView;
    }
    @PostMapping("/modificarCarrera")
    public ModelAndView updateCarrera(@ModelAttribute("nuevaCarrera") Carrera c) {
		
		//guardar
		ListadoCarreras.modificarCarrera(c);
		
		//mostrar el listado
		ModelAndView modelView = new ModelAndView("listaDeCarreras");
		modelView.addObject("listadoCarreras", ListadoCarreras.listarCarreras());	
		
		return modelView;		
	}

}
