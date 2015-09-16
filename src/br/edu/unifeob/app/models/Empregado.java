package br.edu.unifeob.app.models;

public class Empregado {
	
	private String matricula;
	private String nome;
	private String cpf;
	private Cargo cargo;
	private Integer quantidadeDeDependentes;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Integer getQuantidadeDeDependentes() {
		return quantidadeDeDependentes;
	}
	public void setQuantidadeDeDependentes(Integer quantidadeDeDependentes) {
		this.quantidadeDeDependentes = quantidadeDeDependentes;
	}

}
