package br.com.app.appconsumo.model.negocio;

public class Municipio {

	private Integer id;
	private String nome;
	
	@Override
	public String toString() {
		return String.format("%s", 
				this.getNome()
			);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
