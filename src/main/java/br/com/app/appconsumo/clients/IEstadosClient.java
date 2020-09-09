package br.com.app.appconsumo.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.app.appconsumo.model.negocio.Estado;

@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados", name = "estadoClient")
public interface IEstadosClient {

	@GetMapping
	List<Estado> obterEstados();
}
