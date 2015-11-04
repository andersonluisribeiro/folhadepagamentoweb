package br.edu.unifeob.app.models;
import java.util.ArrayList;
import java.util.List;

public class TabelaDeInss {

	private Long id;
	private Integer anoDeVigencia;
	private List<AliquotaDeINSS> aliquotas = new ArrayList<>();
	
	public TabelaDeInss(){
		
	}
	
	public TabelaDeInss(Long id, Integer anoDeVigencia) {		
		this.id = id;
		this.anoDeVigencia = anoDeVigencia;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAnoDeVigencia() {
		return anoDeVigencia;
	}

	public void setAnoDeVigencia(Integer anoDeVigencia) {
		this.anoDeVigencia = anoDeVigencia;
	}

	public List<AliquotaDeINSS> getAliquotas() {
		return aliquotas;
	}

	public void setAliquotas(List<AliquotaDeINSS> aliquotas) {
		this.aliquotas = aliquotas;
	}
		
	
}
