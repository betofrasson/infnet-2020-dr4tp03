package br.com.app.appconsumo.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.app.appconsumo.model.negocio.Municipio;

@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados", name = "municipioClient")
public interface IMunicipioClient {

	@GetMapping("/{id}/municipios")
	List<Municipio> obterMunicipio(@PathVariable Integer id);
}