package br.edu.unifeob.app.models;

public class SalarioMinimo {

	private Long id;
	private Integer anoDeVigencia;
	private Double valor;
	
	public SalarioMinimo(Long id, Integer anoDeVigencia, Double valor) {		
		this.id = id;
		this.anoDeVigencia = anoDeVigencia;
		this.valor = valor;
	}

	public Integer getAnoDeVigencia() {
		return anoDeVigencia;
	}

	public Double getValor() {
		return valor;
	}

	public Long getId() {
		return id;
	}
	
	
}
