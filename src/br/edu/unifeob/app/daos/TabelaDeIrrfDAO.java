package br.edu.unifeob.app.daos;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifeob.app.models.TabelaDeIRRF;

public class TabelaDeIrrfDAO {

	private static List<TabelaDeIRRF> tabelas = new ArrayList<>();
	
	public void salvar(TabelaDeIRRF tabela){
		tabelas.add(tabela);
	}
	
	public void deletar(TabelaDeIRRF tabela){
		tabelas.remove(tabela);
	}
	
	public List<TabelaDeIRRF> getLista(){
		return tabelas;
	}
	
	public TabelaDeIRRF encontrarPorId(Long id){
		TabelaDeIRRF tabelaEncontrada = null;
		
		for(TabelaDeIRRF tabela : tabelas){
			if(tabela.getId().equals(id)){
				tabelaEncontrada = tabela;
			}
		}
		return tabelaEncontrada;
	}
	
}
