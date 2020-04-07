package com.uca.capas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.*;

@Controller
public class MainController {
	
	String usr="uca", pass="012020";//CREDENCIALES CORRECTAS

	@GetMapping("/login")
	public String enviarFormulario(Usuario usuario) {
		return "Login";
	}
	
	@PostMapping("/validacion")
	public String procesarFormulario(Usuario usuario) {
		if(usuario.getUser().equals(usr) && usuario.getPassword().equals(pass)) {
			return "MostrarMensajeV";
		}else {
			return "MostrarMensajeF";
		}		
	}	
	
	
}