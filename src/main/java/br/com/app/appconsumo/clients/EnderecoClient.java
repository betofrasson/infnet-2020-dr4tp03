package br.com.app.appconsumo.clients;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.app.appconsumo.model.negocio.Endereco;

@Component
public class EnderecoClient {

	public Endereco obterPorCep(String cep){
		RestTemplate rest = new RestTemplate();
		return rest.getForObject("https://viacep.com.br/ws/{cep}/json", Endereco.class, cep);
	}
}
