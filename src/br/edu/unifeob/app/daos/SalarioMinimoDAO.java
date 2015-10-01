package br.edu.unifeob.app.daos;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifeob.app.models.SalarioMinimo;

public class SalarioMinimoDAO {
	
	private static List<SalarioMinimo> salarios = new ArrayList<>();
	
	public List<SalarioMinimo> getLista(){
		return salarios;
	}
	
	public void salvar(SalarioMinimo salarioMinimo){
		salarios.add(salarioMinimo);
	}

}
