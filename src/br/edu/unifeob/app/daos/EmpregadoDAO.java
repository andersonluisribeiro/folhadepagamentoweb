package br.edu.unifeob.app.daos;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifeob.app.models.Empregado;

public class EmpregadoDAO {

	private static List<Empregado> empregados = new ArrayList<>();
	
	public void salvar(Empregado empregado){
		empregados.add(empregado);
	}
	
	public void deletar(Empregado empregado){
		empregados.remove(empregado);
	}
	
	public List<Empregado> getLista(){
		return empregados;
	}
	
	public Empregado encontrarPorId(Long id){
		Empregado empregadoEncontrado = null;
		
		for(Empregado empregado : empregados){
			if(empregado.getId().equals(id)){
				empregadoEncontrado = empregado;
			}
		}
		return empregadoEncontrado;
	}
	
	
	
}
