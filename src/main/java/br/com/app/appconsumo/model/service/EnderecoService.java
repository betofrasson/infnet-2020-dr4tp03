package br.com.app.appconsumo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import br.com.app.appconsumo.clients.EnderecoClient;
import br.com.app.appconsumo.clients.IEnderecoClient;
import br.com.app.appconsumo.model.negocio.Endereco;

@Service
public class EnderecoService {

	@Autowired private IEnderecoClient client;
	
	public Endereco obterPorCep(String cep){
		return client.obterPorCep(cep);
	}
}
