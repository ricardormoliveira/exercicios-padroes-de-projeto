package br.com.caelum.tdd;

public class Cliente {

	private String nome;
	private Estado estado;		
	
	public Cliente(String nome, Estado estado) {
		super();
		this.nome = nome;
		this.estado = estado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
