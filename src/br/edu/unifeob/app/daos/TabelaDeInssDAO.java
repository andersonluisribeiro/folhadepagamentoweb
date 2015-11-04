package br.edu.unifeob.app.daos;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifeob.app.models.TabelaDeInss;

public class TabelaDeInssDAO {

	private static List<TabelaDeInss> tabelas = new ArrayList<>();
	
	public void salvar(TabelaDeInss tabela){
		tabelas.add(tabela);
	}
	
	public void deletar(TabelaDeInss tabela){
		tabelas.remove(tabela);
	}
	
	public List<TabelaDeInss> getLista(){
		return tabelas;
	}
	
	public TabelaDeInss encontrarPorId(Long id){
		TabelaDeInss tabelaEncontrada = null;
		
		for(TabelaDeInss tabela : tabelas){
			if(tabela.getId().equals(id)){
				tabelaEncontrada = tabela;
			}
		}
		return tabelaEncontrada;
	}
	
}
