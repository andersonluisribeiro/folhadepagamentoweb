package br.edu.unifeob.app.daos;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifeob.app.models.Categoria;

public class CategoriaDAO {
	
	private static List<Categoria> categorias;
	
	
	
	public List<Categoria> getLista(){
		
		if(categorias == null){
			categorias = new ArrayList<Categoria>();
		}
		
		Categoria equipamento = new Categoria();
		equipamento.setId(1l);
		equipamento.setNome("Equipamento");
		
		Categoria ativos = new Categoria();
		ativos.setId(2l);
		ativos.setNome("Ativos");
		
		Categoria seiLa = new Categoria();
		seiLa.setId(3l);
		seiLa.setNome("Sei lá");
		
		categorias.add(equipamento);
		categorias.add(ativos);
		categorias.add(seiLa);
		
		return categorias;
	}
	
	public void deletar(Categoria categoria){
		categorias.remove(categoria);
	}

}
