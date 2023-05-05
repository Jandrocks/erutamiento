package com.alemeza.enrutamiento.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/coding")
public class CodingController {
	
	@RequestMapping("")
	public String codingSaludo() {
		System.out.println( "Ruta coding2");
		return  "¡Hola Coding Dojo!"; 
	}	
	@RequestMapping("python")
	public String pythonSaludo() {
		System.out.println( "Ruta python");
		return  "¡Python/Django fue increíble!"; 
	}
	@RequestMapping("java")
	public String javaSaludo() {
		System.out.println( "Ruta java");
		return  "¡Java/Spring es mejor!"; 
	}
}

