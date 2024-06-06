package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.model.Carrera;

@Controller
public class CarreraController {
	@GetMapping({ "/formularioCarrera" }) // end_point
	public ModelAndView getFormCarrera() {
		/*
		 * very important how run getFormCarrera
		 * 
		 * vista formCarrera.html
		 */
		ModelAndView modelView = new ModelAndView("formCarrera");
		// add el object
		modelView.addObject(new Carrera());
		return modelView;
	}
}
