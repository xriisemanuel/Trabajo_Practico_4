package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/principal") /*si o si se debe escribir: localhost:8080/principal/*/
public class MainController {
	@GetMapping({"/index","/home"})/*../principal/index*/
	public String getIndexPage() {
		return "index";
	}
	
}
