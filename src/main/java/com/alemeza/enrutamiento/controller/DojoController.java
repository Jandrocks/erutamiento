package com.alemeza.enrutamiento.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController	

public class DojoController {
	
	@RequestMapping("/{dojo}")
	public String saludoDojo(@PathVariable("dojo") String dojo) {
		return "¡El Dojo es increíble!" + " VARIABLE: " + dojo;
	}
	@RequestMapping("/{burbankdojo}")
	public String saludoBurbank(@PathVariable("burbankdojo") String burbankdojo) {
		return "El Dojo Burbank está localizado al sur de California" + " VARIABLE: " + burbankdojo;
	}
	@RequestMapping("/{bsan-jose}")
	public String saludoSanJose(@PathVariable("san-jose") String sanjose) {
		return "El Dojo Burbank está localizado al sur de California" + " VARIABLE: " + sanjose;
	}
	
}
