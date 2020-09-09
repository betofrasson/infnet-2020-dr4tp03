package br.com.app.appconsumo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.app.appconsumo.clients.IMunicipioClient;
import br.com.app.appconsumo.model.negocio.Municipio;

@Service
public class MunicipioService {
	
	@Autowired private IMunicipioClient client;

	public List<Municipio> obterMunicipio(Integer id){
		return client.obterMunicipio(id);
	}
}
