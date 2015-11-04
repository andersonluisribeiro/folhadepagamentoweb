package br.edu.unifeob.app.models;
import java.util.ArrayList;
import java.util.List;

public class TabelaDeInss {

	private Long id;
	private Integer anoDeVigencia;
	
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

	public List<Aliquota> getAliquotas() {
		Aliquota primeira = new Aliquota(0.0, 1399.12, 0.08, null);
		Aliquota segunda = new Aliquota(1399.13, 2331.88, 0.09, null);
		Aliquota terceira = new Aliquota(2331.89, 4663.75, 0.11, null);
		Aliquota quarta = new Aliquota(4663.76, null, null, 513.02);
		
		List<Aliquota> aliquotasFail = new ArrayList<>();
		aliquotasFail.add(primeira);
		aliquotasFail.add(segunda);
		aliquotasFail.add(terceira);
		aliquotasFail.add(quarta);
		
		return aliquotasFail;
	}	
	
}
