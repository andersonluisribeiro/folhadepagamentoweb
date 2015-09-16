package br.edu.unifeob.app.models;

public class SalarioMinimo {

	private Integer anoDeVigencia;
	private Double valor;
	
	public SalarioMinimo(Integer anoDeVigencia, Double valor) {
		this.anoDeVigencia = anoDeVigencia;
		this.valor = valor;
	}

	public Integer getAnoDeVigencia() {
		return anoDeVigencia;
	}

	public Double getValor() {
		return valor;
	}	
	
}
