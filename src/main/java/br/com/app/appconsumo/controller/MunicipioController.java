package br.com.app.appconsumo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.app.appconsumo.model.service.MunicipioService;

@Controller
public class MunicipioController {

	@Autowired
	private MunicipioService service;
	
	@RequestMapping(value = "/estados/{id}/municipios", method = RequestMethod.GET)
	public String obterMunicipio(
				Model model,
				@PathVariable Integer id
			){
		
		model.addAttribute("municipios", service.obterMunicipio(id));
		
		return "municipios";
	}
}
