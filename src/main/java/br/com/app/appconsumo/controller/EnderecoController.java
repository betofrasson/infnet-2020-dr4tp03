package br.com.app.appconsumo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.app.appconsumo.model.service.EnderecoService;

@Controller
public class EnderecoController {

	@Autowired
	private EnderecoService service;
	//private EnderecoService service;
	
	@RequestMapping(value = "/cep", method = RequestMethod.POST)
	public String obterPorCep(
				Model model,
				@RequestParam String cep
			){
		
		model.addAttribute("endereco", service.obterPorCep(cep));
		
		return "endereco";
	}
	
	@RequestMapping(value = "/cep", method = RequestMethod.GET)
	public String obterPorCep(){

		return "endereco";
	}
}
