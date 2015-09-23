package br.edu.unifeob.app.daos;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifeob.app.models.Cargo;

public class CargoDAO {

	private static List<Cargo> cargos = new ArrayList<>();
	
	public void salvar(Cargo cargo){
		cargos.add(cargo);
	}
	
	public void deletar(Cargo cargo){
		cargos.remove(cargo);
	}
	
	public List<Cargo> getLista(){
		return cargos;
	}
	
	public Cargo encontrarPorId(Long id){
		Cargo cargoEncontrado = null;
		
		for(Cargo cargoDaLista : cargos){
			if(cargoDaLista.getId().equals(id)){
				cargoEncontrado = cargoDaLista;
			}
		}
		return cargoEncontrado;
	}
	
	
	
}
