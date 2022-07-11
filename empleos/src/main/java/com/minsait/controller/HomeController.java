package com.minsait.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Se debe de agregar la anotacion a nievel de clase de que es controlador

@Controller
public class HomeController {
	//Se grega anotacion get mapping
	@GetMapping("/") //Se agreagr cadena con la cual respondera el metodo a una rspuesta tipo GET, el cual indica que es e directorio raiz 
 	public String mostrarHome() {
		return "home"; //->Buscara el archivo home.html en templates(Ahi se debe de generar todas las vistas)
	}
}
