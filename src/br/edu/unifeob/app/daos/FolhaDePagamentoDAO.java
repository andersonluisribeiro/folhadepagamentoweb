package br.edu.unifeob.app.daos;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifeob.app.models.Empregado;
import br.edu.unifeob.app.models.FolhaDePagamento;

public class FolhaDePagamentoDAO {

	private static List<FolhaDePagamento> folhas = new ArrayList<>();
	
	public void salvar(FolhaDePagamento folha){
		folhas.add(folha);
	}
	
	public void deletar(FolhaDePagamento folha){
		folhas.remove(folha);
	}
	
	public List<FolhaDePagamento> getLista(){
		return folhas;
	}
	
	public FolhaDePagamento encontrarPorId(Long id){
		FolhaDePagamento folhaEncontrada = null;
		
		for(FolhaDePagamento folha : folhas){
			if(folha.getId().equals(id)){
				folhaEncontrada = folha;
			}
		}
		return folhaEncontrada;
	}
	
	
	
}
