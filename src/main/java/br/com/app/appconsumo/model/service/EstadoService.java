package br.com.app.appconsumo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.app.appconsumo.clients.IEstadosClient;
import br.com.app.appconsumo.model.negocio.Estado;

@Service
public class EstadoService {
	
	@Autowired private IEstadosClient client;

	public List<Estado> obterEstados(){
		return client.obterEstados();
	}
}
