package br.edu.unifeob.app.daos;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifeob.app.models.AliquotaDeINSS;

public class AliquotaDeInssDAO {

	private static List<AliquotaDeINSS> aliquotas = new ArrayList<>();
	
	public void salvar(AliquotaDeINSS aliquota){
		aliquotas.add(aliquota);
	}
	
	public void deletar(AliquotaDeINSS aliquota){
		aliquotas.remove(aliquota);
	}
	
	public List<AliquotaDeINSS> getLista(){
		return aliquotas;
	}
	
	public AliquotaDeINSS encontrarPorId(Long id){
		AliquotaDeINSS aliquotaEncontrada = null;
		
		for(AliquotaDeINSS aliquota : aliquotas){
			if(aliquota.getId().equals(id)){
				aliquotaEncontrada = aliquota;
			}
		}
		return aliquotaEncontrada;
	}
	
	
	
}
